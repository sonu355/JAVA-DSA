import java.util.Scanner;
public class Reversestring {
   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.println("Enter a String : ");
      String name = scn.nextLine();

      int leng = name.length();
      String rev = "";
      for(int i=leng-1; i >= 0; i--){
         rev = rev + name.charAt(i);//chatat(0) for "Hello" word is H
      }
      System.out.println(rev);
      scn.close();
   } 
}
