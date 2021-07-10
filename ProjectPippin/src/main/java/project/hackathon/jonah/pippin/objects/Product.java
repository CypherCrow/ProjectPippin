package project.hackathon.jonah.pippin.objects;

import io.neow3j.devpack.ByteString;

public class Product {
    public String id; 
    public String title; 
    public String price; 
    public String description; 
    public ByteString imageHash;

    public Product(String id, String title, String description, String price, ByteString imageHash){
        this.id = id;
        this.title = title; 
        this.description = description; 
        this.price = price;
        this.imageHash = imageHash;
    }
}
