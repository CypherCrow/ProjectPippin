package project.hackathon.jonah.pippin.contracts; 

import io.neow3j.devpack.annotations.ManifestExtra;
import io.neow3j.devpack.Storage;
import io.neow3j.devpack.StorageContext;
import io.neow3j.devpack.StorageMap; 

@ManifestExtra(key = "name", value="ManufacturerToSupplierContract")
@ManifestExtra(key = "author", value="Pippin Project")
public class ManufacturerToSupplierContract {
    
    static StorageContext ctx = Storage.getStorageContext();
    static final StorageMap contractMap = ctx.createMap((byte) 1); 

}
