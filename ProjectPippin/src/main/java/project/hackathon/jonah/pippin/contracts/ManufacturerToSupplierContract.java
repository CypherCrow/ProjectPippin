package project.hackathon.jonah.pippin.contracts; 

import io.neow3j.devpack.annotations.ManifestExtra;
import io.neow3j.devpack.ByteString;
import io.neow3j.devpack.Hash160;
import io.neow3j.devpack.Storage;
import io.neow3j.devpack.StorageContext;
import io.neow3j.devpack.StorageMap; 
import io.neow3j.devpack.annotations.Safe;
import io.neow3j.devpack.annotations.OnDeployment;

@ManifestExtra(key = "name", value="ManufacturerToSupplierContract")
@ManifestExtra(key = "author", value="Pippin Project")
public class ManufacturerToSupplierContract {
    
    static final byte[] OWNER_KEY = new byte[]{0x0d}; 

    static StorageContext ctx = Storage.getStorageContext();
    static final StorageMap contractMap = ctx.createMap((byte) 1); 
    static final StorageMap certificateOriginMap = ctx.createMap((byte) 2);
    static final StorageMap batchNumberMap = ctx.createMap((byte) 3); 
    static final StorageMap processingDataMap = ctx.createMap((byte) 4); 
    static final StorageMap barcodeMap = ctx.createMap((byte) 5); 
    static final StorageMap shipmentDateMap = ctx.createMap((byte) 6);

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

}
