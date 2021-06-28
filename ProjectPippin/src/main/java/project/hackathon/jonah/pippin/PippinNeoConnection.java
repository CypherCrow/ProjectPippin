package project.hackathon.jonah.pippin; 

//import io.neow3j.types.Hash256;
//import io.neow3j.types.NeoVMStateType;
import java.util.List;

//import io.neow3j.contract.NeoToken;

//import java.math.BigInteger;

import io.neow3j.protocol.Neow3j;
import io.neow3j.protocol.Neow3jConfig;
//import io.neow3j.protocol.core.response.NeoAddress;
//import io.neow3j.protocol.core.response.NeoCloseWallet;
//import io.neow3j.protocol.core.response.NeoGetWalletBalance;
//import io.neow3j.protocol.core.response.NeoListAddress;
//import io.neow3j.protocol.core.Neo;
//import io.neow3j.protocol.core.response.NeoApplicationLog;
//import io.neow3j.protocol.core.response.NeoGetApplicationLog;
//import io.neow3j.protocol.core.response.NeoOpenWallet;
//import io.neow3j.protocol.core.response.NeoGetTransaction;
//import io.neow3j.protocol.core.response.Transaction;
//import io.neow3j.protocol.core.stackitem.StackItem;
import io.neow3j.protocol.http.HttpService;
import io.neow3j.wallet.Account;
import io.neow3j.wallet.Wallet;

public class PippinNeoConnection {
    
    public static void main(String[] args) throws Throwable {
        Neow3j neow3j = Neow3j.build(new HttpService("http://localhost:50012"),
            new Neow3jConfig().setNetworkMagic(769));
            
        neow3j.subscribeToNewBlocksObservable(true)
            .subscribe((blockReqResult) -> {
                System.out.println("blockIndex:" + blockReqResult.getBlock().getIndex());
                System.out.println("hashId: " + blockReqResult.getBlock().getHash()); 
                System.out.println("confirmations: " + blockReqResult.getBlock().getConfirmations()); 
                System.out.println("transactions: " + blockReqResult.getBlock().getTransactions());  
            }
        );

        /*
        Hash256 txHash = new Hash256("a0dd3834191b38de91a482ff7b447ed5001f8913e6fea0258d516190f17d76d1");
        NeoGetApplicationLog response = neow3j.getApplicationLog(txHash).send(); 

        if(response.hasError()){
            throw new Exception("Error fetching transaction: " + response.getError().getMessage()); 
        }

        NeoApplicationLog.Execution execution = response.getApplicationLog().getExecutions().get(0); 

        if(execution.getState().equals(NeoVMStateType.FAULT)){
            throw new Exception("Invocation failed"); 
        }

        List<StackItem> stack =  execution.getStack(); 
        StackItem returnValue = stack.get(0); 
        System.out.println(returnValue); 

        List<NeoApplicationLog.Execution.Notification> notifications = execution.getNotifications(); 
        System.out.println(notifications); 
        */

        /* NeoOpenWallet response = neow3j.openWallet("C:/Users/Akanb/Documents/GitHub/ProjectPippin/wallets/eric.neo-wallet.json", "draven").send(); 
        
        if(response.hasError()){
            throw new Exception("Failed to open wallet. Error message: " + response.getError().getMessage());
        }

        if(response.getOpenWallet()){
            System.out.println("Successfully opened wallet 'eric'.");
        }
        else{
            System.out.println("Wallet 'eric' not opened.");
        }

        NeoListAddress response2 = neow3j.listAddress().send(); 

        if(response2.hasError()){
            throw new Exception("Failed to fetch wallet accounts. Error message: " + response.getError().getMessage());
        }

        List<NeoAddress> listOfAddresses = response2.getAddresses(); 
        System.out.println(listOfAddresses);

        NeoGetWalletBalance response3 = neow3j.getWalletBalance(NeoToken.SCRIPT_HASH).send();

        if(response3.hasError()){
            throw new Exception("Failed to get wallet balance. Error message: " + response.getError().getMessage());
        }

        String balance = response3.getWalletBalance().getBalance(); 
        System.out.println(balance); 

        NeoCloseWallet response4 = neow3j.closeWallet().send();

        if(response.hasError()){
            throw new Exception("Failed to close the  wallet. Error message: " + response.getError().getMessage()); 
        }

        System.out.println(response4); */

        Wallet daveIcke = Wallet.create("conspiracy");
        System.out.println(daveIcke.getName()); 

        List<Account> walletAccounts = daveIcke.getAccounts();

        for(int i = 0; i < walletAccounts.size(); i++){
            System.out.println(walletAccounts.get(i)); 
        }
    }

}
