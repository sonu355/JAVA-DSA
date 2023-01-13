import java.util.Scanner;

public class Printarr {
    public static void main(String[] args) {
        int[][] arr = new int[][]{ {1, 2, 3, 4},
                                   {4, 5, 6, 8},
                                   {9, 10, 11, 12}};
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arrr = new int[m][n];
            for(int  i = 0; i < m; i++){
                for(int j = 0; j< n; j++){
                    arrr[i][j] = scn.nextInt();
                }
            }
            for(int i = 0; i < arrr.length; i++){
                for(int j = 0; j < arrr[i].length; j++){
                    System.out.print(arrr[i][j] + " ");
                }   
                System.out.println();         
            }
    }
}
