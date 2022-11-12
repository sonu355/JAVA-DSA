import java.util.HashSet;
import java.util.Set;

public class Hashingchallnege2 {
    public static int Union(int a[], int b[]){
        HashSet <Integer> set = new HashSet<>();
        for(int x : a){
           set.add(x);
        }
        for(int x : b){
            set.add(x);
        } 
        return set.size();
        
    }

    public static void main(String[] args) {
        int[] a = {5, 10, 15, 5};
        int[] b = {10, 15, 4};
        int result = Union(a, b);
        System.out.println(result);
     
    }
}
