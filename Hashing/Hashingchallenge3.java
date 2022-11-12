import java.security.cert.X509CertSelector;
import java.util.HashSet;

public class Hashingchallenge3 {
    public static int Intersection(int a[], int b[]){
       HashSet <Integer> s = new HashSet<>();
       int count = 0;
         for(int x : a){
            s.add(x);
         }
        for(int x : b){
            if(s.contains(x)){
              count++;
              s.remove(x);
            }
        }
        return count;
    }

   public static void main(String[] args) {
       int[] a = {5, 10, 15, 5, 10};
       int[] b = {15, 5, 5, 10, 4};
       int result = Intersection(a, b);
       System.out.println(result);
   }
}
