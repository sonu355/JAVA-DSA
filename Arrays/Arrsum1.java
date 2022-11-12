import java.util.Scanner;;
public class Arrsum1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("enter the size first and values of array");
        int s1 = scn.nextInt();
        int[] a1 = new int[s1] ;
        for(int i=0; i < a1.length; i++){
            a1[i] = scn.nextInt();
        }

        System.out.println("enter the size second and values of array");
        int s2 = scn.nextInt();
        int[] a2= new int[s2] ; 
        for(int i=0; i < a1.length; i++){
            a2[i] = scn.nextInt();
        }

        int[] sum = new int[s1];
        for(int i=0; i<s1; i++){
            sum[i] = a1[i] + a2[i];
        }
      for(int val : sum){
        System.out.println(val);
      }
      scn.close();
    }
}
