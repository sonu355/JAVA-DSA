import java.util.HashSet;

public class Hashingchallnege2 {
    public static int setUnion(int a[], int b[]){
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
        int result = setUnion(a, b);
        System.out.println(result);
     
    }
}
