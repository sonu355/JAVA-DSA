import java.util.Scanner;;
public class Reversenum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scn.nextInt ();
        int rev=0,rem;
        while(n != 0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        
        System.out.println(rev);
        scn.close();
    }
}
