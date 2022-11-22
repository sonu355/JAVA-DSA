
public class Waveoftwodarray{
    public static void main(String[] args) {
        int[][] num = {
                         {11, 12, 13, 14},
                         {21, 22, 23, 24},
                         {31, 32, 33, 34},
                         {41, 42, 43, 44} 
                                            };
        int x = 34;

        for(int i = 0; i < num.length; i++){
           for(int j = 0; j < num[0].length; j++){
            System.out.print(num[i][j]);
           }
           System.out.println(" ");
        }

        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[0].length; j++){
                if (num[i][j] == x) {
                    System.out.println("number found at" + i + " " + j);
                    break;
                }
            }       
        }
    }
}