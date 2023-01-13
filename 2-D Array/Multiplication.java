import java.text.BreakIterator;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        // Scanner scn  = new Scanner(System.in);

        // int r1 = scn.nextInt();
        // int c1 = scn.nextInt();
        // int[][] arr1 = new int[r1][c1];
        // for(int i = 0; i < arr1.length; i++){
        //     for(int j = 0; j < arr1[0].length; j++){
        //         arr1[i][j] = scn.nextInt();
        //     }
        // }

        // int r2 = scn.nextInt();
        // int c2 = scn.nextInt();
        // int[][] arr2 = new int[r1][c1];
        // for(int i = 0; i < arr2.length; i++){
        //     for(int j = 0; j < arr2[0].length; j++){
        //         arr2[i][j] = scn.nextInt();
        //     }
        // }

        // if(c1 != r2){
        //     System.out.println("Invalid input");
        //     return;
        // }

        // int[][] prd = new int[r1][c2];
        //     for(int i = 0; i < prd.length; i++){
        //         for(int j = 0; j < prd[0].length; j++){
        //             for(int k = 0; k < c1; k++){
        //                 prd[i][j] += arr1[i][k] * arr2[k][j];
        //             }
        //         }
        //     }
        //     for(int i = 0; i < prd.length; i++){
        //         for(int j = 0; j < prd[0].length; j++){ 
        //             System.out.print(prd[i][j] + " ");
        //         }
        //     }
        //             System.out.println();
        int[][] one = new int[][] {{1, 2, 3, 4},
                                   {5, 6, 7, 8},
                                   {8, 9, 5, 3}}; 
        int[][] two = new int[][] {{1, 2, 3, 4},
                                   {5, 6, 7, 8},
                                   {8, 9, 5, 3},
                                   {8, 6, 2, 1}}; 
        int [][] prd = new int [3][3];
        
    
        for(int i = 0; i < 3; i++){
            for(int  j = 0; j < 3; j++){
               prd[i][j] = 0;
               for(int k = 0; k < 3; k++){
                prd[i][j] = one[i][k] * two[k][j];
               }
               System.out.print(prd[i][j] + " ");
            }
            System.out.println();
        }
    }
}
