import java.util.Scanner;

/*  Addition of number using function
import java.util.Scanner;
public class Function {
    public static int addNum(int a, int b) {
        int sum = a + b;
        return sum;
       }

       public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        int sum = addNum(a,b);
        System.out.println(sum);
        scn.close();
    }
}   */

//Factorial of a number
public class Function{
    public static void printFact(int x){
        if( x < 0){
          System.out.println("Chuitya ahe ka");
          return;
        }
        int factorial = 1;
        
        for(int i = x; i >= 1; i--){
         factorial = factorial * i;  
        }
        System.out.println("Factorial of a number is : "+factorial);
        return;
    }

    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
       // System.out.println("Factorial of a number is : " + printFact(x));
       printFact(x);
         scn.close();
    }
}
