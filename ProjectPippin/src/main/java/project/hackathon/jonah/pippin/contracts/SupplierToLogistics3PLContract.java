package project.hackathon.jonah.pippin.contracts;

import io.neow3j.devpack.annotations.ManifestExtra; 

import io.neow3j.devpack.Storage;
import io.neow3j.devpack.StorageContext;
import io.neow3j.devpack.StorageMap; 

@ManifestExtra(key = "name", value="SupplierToLogistics3PLContract")
@ManifestExtra(key = "author", value="Pippin Project")
public class SupplierToLogistics3PLContract {

    static StorageContext ctx = Storage.getStorageContext();
    static final StorageMap contractMap = ctx.createMap((byte) 1);

    //check account types for verification for every contract
    
    public static String logistics3PLContract(){
        return "Logistics.";
    }

}
