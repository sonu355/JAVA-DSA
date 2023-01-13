import java.util.Scanner;

public class Name{
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.next();
        printMyName(name);
        scn.close();
    }
}