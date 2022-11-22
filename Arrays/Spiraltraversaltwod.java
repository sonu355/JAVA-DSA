public class Spiraltraversaltwod {
    public static void main(String[] args) {
        int[][] arr = {
                        {11, 12, 13, 14, 15, 16, 17},
                        {21, 22, 23, 24, 25, 26, 27},
                        {31, 32, 33, 34, 35, 36, 37},
                        {41, 42, 43, 44, 45, 46, 47},
                        {51, 52, 53, 54, 55, 56, 57}  
                                                        };
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i] [j]);
            }
            System.out.println(" ");
        }
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;
        int tne = arr.length * arr[0].length;
        int count = 0;
        
        while(count < tne){
            // left row
            for(int i = minr, j = minc; i <= maxr && count < tne; i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;
            //bottom row
            for(int i = maxr, j = minc; j <= maxc && count < tne; j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;
            // rigth row
            for(int i = maxr, j = maxc; i >= minr && count < tne; i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            // top row
            for(int i = minr, j = maxc; j >= minc && count < tne; j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }
    }
}
