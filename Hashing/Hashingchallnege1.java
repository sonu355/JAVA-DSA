import java.util.HashSet;

public class Hashingchallnege1 {
    public static int countDistinct(int a[]){
       HashSet <Integer> set = new HashSet<>();
         for(int element : a){
            set.add(element);
         }
         return set.size();
    }

    
   public static void main(String[] args) {
        int[] a = {23, 47, 90, 56, 47, 23, 56};
        int result = countDistinct(a);
        System.out.println(result);
    }
}
