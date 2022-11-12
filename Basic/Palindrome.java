import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the NUmber");
        int n = scn.nextInt();

        int temp = n;
        int rev=0,rem;

        while(temp != 0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if(n == rev)        {
            System.out.println(n+" is palindrome");
        } else {
            System.out.println(n+" is not palindrome");
        }
        scn.close();
    }
}
