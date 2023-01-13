import java.util.Scanner;

public class Basic {
    public static void printCounting(int x){
        if(x == 0){
            return;
        }
        System.out.println(x);
        printCounting(x - 1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        printCounting(x);
        scn.close();
    }
}
