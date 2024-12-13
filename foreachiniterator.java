import java.util.*;
public class foreachiniterator{
    public static void main(String [] args){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("students");
        a.add("Jashu");
        // iterator
        for(String s:a){
            System.out.println(s+" ");
        }
    }
}