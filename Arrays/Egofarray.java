import java.util.ArrayList;



public class Egofarray{

   
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        ArrayList <Integer> arrlist = new ArrayList<>();
            int n = arr.length;
            System.out.println(n);
            // System.out.println(7 % 6);
             //System.out.println(4 % 4);

                for(int i = 0; i < 2 * n ; i++){
                    arrlist.add(arr[i % n]);
                    // System.out.println("ne T");
                    // System.out.println(i);
                    System.out.print +(i % n);
                }
            System.out.println(arrlist);
    }
}