import java.util.Scanner;

public class Basic {
     public static void main(String[] args) {
        int x = 5;
        printCounting(x);
    }
    public static void printCounting(int x){
        if(x == 0 ){
            return;
        }
        System.out.println(x);
        printCounting(x - 1);
        System.out.println(x);
    }
   /*  public static void main(String[] args) {
        printHi(5);
    }
    public static void printHi(int count){
        System.out.println("hi");
        if(count <= 1){
            return;
        }
        printHi(count - 1);
    }*/
}
