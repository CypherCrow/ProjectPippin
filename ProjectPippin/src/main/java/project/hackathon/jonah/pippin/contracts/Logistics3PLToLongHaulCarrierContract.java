package project.hackathon.jonah.pippin.contracts;

import io.neow3j.devpack.annotations.ManifestExtra;
import io.neow3j.devpack.annotations.Safe;
import io.neow3j.devpack.Hash160;
import io.neow3j.devpack.Storage;
import io.neow3j.devpack.StorageContext;
import io.neow3j.devpack.StorageMap; 

@ManifestExtra(key = "name", value="Logistics3PLToLongHaulCarrierContract")
@ManifestExtra(key = "author", value="Pippin Project")
public class Logistics3PLToLongHaulCarrierContract {

    static final byte[] OWNER_KEY = new byte[]{0x0d};
 
    static StorageContext ctx = Storage.getStorageContext();
    static final StorageMap contractMap = ctx.createMap((byte) 1); 

    @Safe
    public static Hash160 getOwner(){
        return new Hash160(contractMap.get(OWNER_KEY));
    }   
}
