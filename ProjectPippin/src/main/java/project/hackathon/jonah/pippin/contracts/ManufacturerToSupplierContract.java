package project.hackathon.jonah.pippin.contracts; 

import io.neow3j.devpack.annotations.ManifestExtra;
import io.neow3j.devpack.ByteString;
import io.neow3j.devpack.Hash160;
import io.neow3j.devpack.Storage;
import io.neow3j.devpack.StorageContext;
import io.neow3j.devpack.StorageMap; 
import io.neow3j.devpack.annotations.Safe;
import io.neow3j.devpack.annotations.OnDeployment;
import io.neow3j.devpack.Runtime; 
//import io.neow3j.devpack.events.Event4Args;

@ManifestExtra(key = "name", value="ManufacturerToSupplierContract")
@ManifestExtra(key = "author", value="Pippin Project")
public class ManufacturerToSupplierContract {
    
    static final byte[] OWNER_KEY = new byte[]{0x0d}; 

    //StorageContext = gateway to a contract's storage
    //can be passed to other contracts for the latter to perform read/write ops on current contract's persistent storage 
    static StorageContext ctx = Storage.getStorageContext();
    //contractMap: map of elements containing metadata on each contract issued;
    static final StorageMap contractMap = ctx.createMap((byte) 1); 
    static final StorageMap receiverMap = ctx.createMap((byte) 2);
    static final StorageMap shipmentDateMap = ctx.createMap((byte) 3);

    // To be implemented later 
    //static final StorageMap certificateOriginMap = ctx.createMap((byte) 2);
    //static final StorageMap batchNumberMap = ctx.createMap((byte) 3); 
    //static final StorageMap processingDataMap = ctx.createMap((byte) 4); 
    //static final StorageMap barcodeMap = ctx.createMap((byte) 5); 

    @OnDeployment
    public static void deploy(Object data, boolean update) throws Exception {
        if(!update){
            if(data == null){
                throw new Exception("Expected owner hash as an argument, but argument was null.");
            }
            if(!(new Hash160((ByteString) data).isValid())){
                throw new Exception("Expected owner hash as an argument, but argument was an invalid Hash160");
            }
            contractMap.put(OWNER_KEY, (ByteString) data); 
        }
    }

    @Safe
    public static Hash160 getOwner(){
        return new Hash160(contractMap.get(OWNER_KEY)); 
    }

    public static boolean signOrder(String orderId,  String receiver, String shipmentDate){
        if(receiver == null || orderId == null || shipmentDate == null){
            return false; 
        }
        if(Runtime.getCallingScriptHash() != getOwner()){
            return false; 
        }
        if(receiverMap.get(orderId) != null || shipmentDateMap.get(orderId) != null){
            return false;
        }

        receiverMap.put(orderId, receiver); 
        shipmentDateMap.put(orderId, shipmentDate);
        return true; 
    }

    public static boolean deleteOrder(String orderId){
        if(Runtime.getCallingScriptHash() != getOwner()){
            return false; 
        }

        receiverMap.delete(orderId); 
        shipmentDateMap.delete(orderId); 
        return true;
    }

}
