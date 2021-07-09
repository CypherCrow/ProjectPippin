package project.hackathon.jonah.pippin.contracts;

import io.neow3j.devpack.annotations.ManifestExtra; 
import io.neow3j.devpack.annotations.Safe;
import io.neow3j.devpack.Hash160;
import io.neow3j.devpack.Storage;
import io.neow3j.devpack.StorageContext;
import io.neow3j.devpack.StorageMap; 

@ManifestExtra(key = "name", value="SupplierToLogistics3PLContract")
@ManifestExtra(key = "author", value="Pippin Project")
public class SupplierToLogistics3PLContract {

    static final byte[] OWNER_KEY = new byte[]{0x0d};

    static StorageContext ctx = Storage.getStorageContext();
    static final StorageMap contractMap = ctx.createMap((byte) 1);
    static final StorageMap packingList = ctx.createMap((byte) 2);
    static final StorageMap orderNumberMap = ctx.createMap((byte) 3); 
    static final StorageMap batchNumberMap = ctx.createMap((byte) 4); 
    static final StorageMap productionDataMap = ctx.createMap((byte) 5); 
    static final StorageMap dmisMap = ctx.createMap((byte) 6); //checks shipment specification

    //check account types for verification for every contract

    @Safe
    public static Hash160 getOwner(){
        return new Hash160(contractMap.get(OWNER_KEY));
    }   
    
}
