package project.hackathon.jonah.pippin;

import java.io.File;
import java.nio.file.Paths;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.Test;

import io.neow3j.contract.ContractManagement;
import io.neow3j.contract.NefFile;
import io.neow3j.contract.SmartContract;
import io.neow3j.types.Hash160;
import io.neow3j.types.Hash256;
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

    private static final File MANUFACTURER_TO_SUPPLIER_NEF_FILE = 
        Paths.get("C:/Users/Akanb/Documents/GitHub/ProjectPippin/ProjectPippin/build/neow3j/ManufacturerToSupplierContract.nef").toFile();

    private static final File MANUFACTURER_TO_SUPPLIER_MANIFEST_FILE = 
        Paths.get("C:/Users/Akanb/Documents/GitHub/ProjectPippin/ProjectPippin/build/neow3j/ManufacturerToSupplierContract.manifest.json").toFile();

    private static ContractManagement contractMgmt = new ContractManagement(neow);

    private static Account eric = Account.fromAddress("Nck71hdR19bZyv224SGk5DYvurQpqwqwbK");
    private static Wallet wallet = Wallet.withAccounts(eric); 

    @Test
    public void deployManufacturerToSupplierContract() throws Throwable {
        NefFile nef = NefFile.readFromFile(MANUFACTURER_TO_SUPPLIER_NEF_FILE);
        ContractManifest manifest = objectMapper.readValue(MANUFACTURER_TO_SUPPLIER_MANIFEST_FILE, ContractManifest.class);
        ContractParameter ownerHash = ContractParameter.hash160(eric);
        NeoSendRawTransaction response = contractMgmt.deploy(nef, manifest, ownerHash)
            .signers(Signer.feeOnly(eric))
            .wallet(wallet)
            .sign()
            .send();
            
        if(response.hasError()) {
            response.throwOnError();
        }

        Hash256 txHash = response.getSendRawTransaction().getHash();
        Await.waitUntilTransactionIsExecuted(txHash, neow);
        Hash160 contractHash = SmartContract.calcContractHash(eric.getScriptHash(),
            nef.getCheckSumAsInteger(), manifest.getName());
        System.out.printf("ProductContract deployed (%s).\n", contractHash.toString()); 
    }

}
