package project.hackathon.jonah.pippin;

import java.io.File;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Test;

import io.neow3j.contract.ContractManagement;
import io.neow3j.contract.NefFile;
import io.neow3j.contract.SmartContract;
import io.neow3j.devpack.Hash160;
import io.neow3j.devpack.Hash256;
import io.neow3j.protocol.Neow3j;
import io.neow3j.protocol.core.response.ContractManifest;
import io.neow3j.protocol.core.response.NeoSendRawTransaction;
import io.neow3j.protocol.http.HttpService;
import io.neow3j.transaction.Signer;
import io.neow3j.types.ContractParameter;
import io.neow3j.utils.Await;
import io.neow3j.wallet.Account; 
import io.neow3j.wallet.Wallet; 

public class Scripts {

    private static Neow3j neow = Neow3j.build(new HttpService("http://localhost:50012"));
    private static ObjectMapper objectMapper = new ObjectMapper();

    private static final File PRODUCT_CREATE_NEF_FILE = 
        Paths.get("./build/neow3j/ProductContract.nef").toFile();

    private static final File PRODUCT_CREATE_MANIFEST_FILE = 
        Paths.get("./build/neow3j/ProductContract.manifest.json").toFile();

    private static ContractManagement contractMgmt = new ContractManagement(neow);

    private static Account alice = Account.fromWIF("0x450d6c2a04b5b470339a745427bae6828400cf048400837d73c415063835e005");
    private static Wallet wallet = Wallet.withAccounts(alice); 

    @Test
    public void deployProjectContract() throws Throwable {
        NefFile nef = NefFile.readFromFile(PRODUCT_CREATE_NEF_FILE);
        ContractManifest manifest = objectMapper.readValue(PRODUCT_CREATE_MANIFEST_FILE, ContractManifest.class);
        ContractParameter ownerHash = ContractParameter.hash160(alice);
        NeoSendRawTransaction response = contractMgmt.deploy(nef, manifest, ownerHash)
            .signers(Signer.feeOnly(alice))
            .wallet(wallet)
            .sign()
            .send();
            
        if(response.hasError()) {
            response.throwOnError();
        }

        Hash256 txHash = response.getSendRawTransaction().getHash();
        Await.waitUntilTransactionIsExecuted(txHash, neow);
        Hash160 contractHash = SmartContract.calcContractHash(alice.getScriptHash()),
            nef.getCheckSumAsInteger(), manifest.getName());
        System.out.printf("ProductContract deployed (%s).\n", contractHash.toString()); 
    }

    public void deployManufacturerToSupplierContract() throws Throwable {

    }
    
}
