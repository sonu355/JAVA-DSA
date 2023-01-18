import java.util.Scanner;

public class Printmaze {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // int n = scn.nextInt();
        // int m = scn.nextInt();
        int[][] arr = {{1,0,0},
                       {0,1,0},
                       {0,0,1}};
        int n = arr.length;
        int m = arr[0].length;
        printMaze(1,1,n,m,"");
    }

    public static void printMaze(int sr, int sc, int dr, int dc, String psf){
        if(sr > dr || sc > dc){
            return;
        }
        if(sr == dr && sc == dc){
            System.out.println(psf);
            return;
        }
        printMaze(sr, sc + 1, dr, dc, psf+"h");
        printMaze(sr + 1, sc, dr, dc, psf+"v");
     
    }
    
}
   

    
