import java.util.*;
public class printinghashmapkeyvalue{
    public static void main(String [] args){
        HashMap<String,String> a=new HashMap<>();
        a.put("SNO","01");
        a.put("SName","Jashu");
        System.out.println(a);
        //printing hash map key value
        if(a.containsKey("SName")){
            String d=a.get("SName");
            System.out.println(d);
        }
    }
}