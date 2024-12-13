import java.util.*;
class hashsetlinkedlist{
    public static void main(String []args){
        LinkedHashSet<String> a=new LinkedHashSet<>();
        a.add("Hello");
        a.add("Hello");
        a.add("Students");
        a.add("Jashu");
        a.add("Students");
        System.out.println(a);
        a.remove("Jashu");
        System.out.println(a);
        a.clear();
        System.out.println(a);
    }
}