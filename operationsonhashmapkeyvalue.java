import java.util.*;
public class  operationsonhashmapkeyvalue{
    public static void main(String [] args){
        HashMap<String,String> a=new HashMap<>();
        a.put("SNO","01");
        a.put("SName","Jashu");
        a.put("City","Banglore");
        System.out.println(a);
        // modifying value for a key
        a.put("SNo","90");
        System.out.println(a);
        // removing key in a hash map
        a.remove("SName");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}