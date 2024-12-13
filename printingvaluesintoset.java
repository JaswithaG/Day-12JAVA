import java.util.*;
public class printingvaluesintoset{
    public static void main(String [] args){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("students");
        a.add("Jashu");
        // printing using iterator
        Iterator itr=a.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" ");
        }
    }
}