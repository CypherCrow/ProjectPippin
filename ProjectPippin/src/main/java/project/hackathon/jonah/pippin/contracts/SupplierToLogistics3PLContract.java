package project.hackathon.jonah.pippin.contracts;

import io.neow3j.devpack.annotations.ManifestExtra; 

@ManifestExtra(key = "name", value="SupplierToLogistics3PLContract")
@ManifestExtra(key = "author", value="Pippin Project")
public class SupplierToLogistics3PLContract {

    //check account types for verification for every contract
    
    public static String logistics3PLContract(){
        return "Logistics.";
    }

}
