import java.util.Scanner;
public class Lec27 {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int on = n;
        int ok = k;
        while(n%k!=0){
            int rem = n % k;
             n = k;
             k = rem;

        }
        int gcd = k;
        int lcm = (on * ok)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);
        scn.close();
    }
}  