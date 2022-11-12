import java.util.HashSet;

public class Hashingfun{
    public static void main(String[] args) {
        HashSet <Integer> s = new HashSet<>();
        s.add(5);//to add new elemenet
        s.add(10);
        s.add(15);
        s.add(20);
        System.out.println(s); //print the set
        s.remove(15);
       System.out.println(s);
        System.out.println(s.isEmpty()); //to checkc that set is empty or not
        System.out.println(s.size()); // gives size of element
        s.clear(); //clear all set
System.err.println(s);
    }
}