package project.hackathon.jonah.pippin.contracts;

import io.neow3j.devpack.annotations.ManifestExtra;
import io.neow3j.devpack.annotations.Safe;

@ManifestExtra(key = "name", value="LongHaulCarrierToWarehouseContract")
@ManifestExtra(key = "author", value="Pippin Project")
public class LongHaulCarrierToWarehouseContract {

    @Safe //makes function read-only
    public static String warehouseHello(){
        return "This is a Pippin Warehouse. Nice to meet you!";
    }

}