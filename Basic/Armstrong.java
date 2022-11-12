import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = scn.nextInt();

        int t1 = n;
        int leng = 0;
        while(t1 != 0){
            leng = leng + 1;//code for length
            t1 = t1/10;
        }
        int t2 = n;
        int arm = 0;
        while(t2 != 0){ //code for reverse a number
            int mul = 1;
            int rem = t2 % 10;
            for(int i=1; i<leng; i++){
                mul = mul*rem;
            }
            arm = arm + mul;
            t2 = t2/10;
        }
        if (arm==n) {
            System.out.println(n + " is Armstrong");
        } else {
            System.out.println(n + " is not Armstrong");
        }
    scn.close();
    }
}
