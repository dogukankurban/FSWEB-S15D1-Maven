import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("232332323232", new ArrayList<>());
        mobilePhone.addNewContact(new Contact("emrah","2334534"));
        mobilePhone.addNewContact(new Contact("sfdfsf","2334534"));
        mobilePhone.addNewContact(new Contact("emrah","2334gdsfgdf534"));

    }
}
