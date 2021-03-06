package project.hackathon.jonah.pippin.contracts;

import io.neow3j.devpack.annotations.ManifestExtra;
import io.neow3j.devpack.annotations.DisplayName;
import io.neow3j.devpack.annotations.OnVerification;
import io.neow3j.devpack.events.Event1Arg;

import java.util.Date;

//import java.text.ParseException;
import java.text.SimpleDateFormat;
  
/*
    This contract will be used as a reminder for delivery and to be fulfilled once the package is delivered to the cosignee;
    Once the cosignee signs the ShortHaulCarrierToCosignee Contract, this contract will be signed automatically to complete 
    the delivery process
*/

@ManifestExtra(key = "name", value = "OrderContract")
@ManifestExtra(key = "author", value = "Pippin Project")
@DisplayName("OrderContract")
public class OrderContract {

    //US date mode to be incorporated soon
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private static Date deliveryDate = new Date();
    
    @DisplayName("onVerification")
    static Event1Arg<String> onVerification; 

    public static boolean inputDeliveryDate(String date) throws Exception{
        try{
            deliveryDate = dateFormat.parse(date); 
            return true; 
        }
        catch(Exception e){
            System.out.println("Wrong date format. Try again"); 
            return false; 
        }
    }

    // if date is earlier than guaranteed, a bonus NEO and GAS are awarded to the deliverer
    // make sure this is not abused
    @OnVerification
    public static boolean verifyDeliveryDate(String date) throws Exception {
        Date dateParsed = dateFormat.parse(date);

        if(dateParsed.before(deliveryDate)){
            onVerification.fire("Bonus NEO and GAS for early delivery!"); 
            return true;
        }
        if(dateParsed.after(deliveryDate)){
            onVerification.fire("Ooh. You're late. No NEO and GAS. :(");
            return false; 
        }

        onVerification.fire("Delivery date reached. You get this required NEO and GAS amount.");
        return true; 

    }
}
