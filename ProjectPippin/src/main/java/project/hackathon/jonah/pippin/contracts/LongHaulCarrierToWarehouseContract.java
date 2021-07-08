package project.hackathon.jonah.pippin.contracts;

import io.neow3j.devpack.annotations.ManifestExtra;
import io.neow3j.devpack.annotations.Safe;

import io.neow3j.devpack.Storage;
import io.neow3j.devpack.StorageContext;
import io.neow3j.devpack.StorageMap; 

@ManifestExtra(key = "name", value="LongHaulCarrierToWarehouseContract")
@ManifestExtra(key = "author", value="Pippin Project")
public class LongHaulCarrierToWarehouseContract {

    static StorageContext ctx = Storage.getStorageContext();
    static final StorageMap contractMap = ctx.createMap((byte) 1);

    @Safe //makes function read-only
    public static String warehouseHello(){
        return "This is a Pippin Warehouse. Nice to meet you!";
    }

}