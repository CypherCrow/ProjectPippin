package project.hackathon.jonah.pippin.contracts;

import io.neow3j.devpack.annotations.ManifestExtra;

@ManifestExtra(key = "name", value="WarehouseContract")
@ManifestExtra(key = "author", value="Pippin Project")
public class PippinWarehouseContract {

    public static String warehouseHello(){
        return "This is a Pippin Warehouse. Nice to meet you!";
    }

}