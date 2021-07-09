package project.hackathon.jonah.pippin.contracts;

import io.neow3j.devpack.ByteString;
import io.neow3j.devpack.Hash160;
import io.neow3j.devpack.annotations.ManifestExtra;
import io.neow3j.devpack.annotations.OnDeployment;
import io.neow3j.devpack.annotations.Safe;
import io.neow3j.devpack.Storage;
import io.neow3j.devpack.StorageMap;
import io.neow3j.devpack.StorageContext;

@ManifestExtra(key = "name", value="ProductCreationContract")
@ManifestExtra(key = "author", value="Pippin Project")
public class ProductCreationContract {

    static final byte[] OWNER_KEY = new byte[]{0x0d}; 

    static StorageContext ctx = Storage.getStorageContext();
    static final StorageMap contractMap = ctx.createMap((byte) 1);
    static final StorageMap titleMap = ctx.createMap((byte) 2); 
    static final StorageMap descriptionMap = ctx.createMap((byte) 3); 
    static final StorageMap imgHashMap = ctx.createMap((byte) 4); 

    @OnDeployment
    public static void deploy(Object data, boolean update) throws Exception {
        if(!update){
            if(data == null){
                throw new Exception("Expects the owner hash as an argument but argument was null"); 
            }
            contractMap.put(OWNER_KEY, (ByteString) data); 
        }
    }

    @Safe
    public static Hash160 getOwner(){
        return new Hash160(contractMap.get(OWNER_KEY)); 
    }
    
    /**
     * Creates a product
     * 
     * 
     * @param productId
     * @param title
     * @param description
     * @param imageHash
     * @return
     */
    public static boolean createProduct(String productId, String title, String description, ByteString imageHash){
        if(productId == null || title ==  null || description == null || imageHash == null){
            return false; 
        }

        return true;
    }

}
