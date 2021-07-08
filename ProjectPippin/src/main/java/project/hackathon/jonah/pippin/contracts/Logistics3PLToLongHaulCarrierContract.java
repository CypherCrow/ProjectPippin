package project.hackathon.jonah.pippin.contracts;

import io.neow3j.devpack.annotations.ManifestExtra; 

import io.neow3j.devpack.Storage;
import io.neow3j.devpack.StorageContext;
import io.neow3j.devpack.StorageMap; 

@ManifestExtra(key = "name", value="Logistics3PLToLongHaulCarrierContract")
@ManifestExtra(key = "author", value="Pippin Project")
public class Logistics3PLToLongHaulCarrierContract {
 
    static StorageContext ctx = Storage.getStorageContext();
    static final StorageMap contractMap = ctx.createMap((byte) 1); 
}
