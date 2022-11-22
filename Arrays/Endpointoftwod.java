public class Endpointoftwod {
    public static void main(String[] args) {
        int[][] arr =  {    {0, 0, 1, 0},
                            {1, 0, 0, 1},
                            {0, 0, 0, 1},
                            {1, 0, 1, 0}
                                            };
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
             //   System.out.println(arr[i][j]);
            }
        }
        int dir = 0;
        int i = 0;
        int j = 0;

        while(true){
            dir = (dir + arr[i][j]) % 4;
            if(dir == 00){
                j++;
            }
            else if(dir == 1){
                i++;
            }
            else if(dir == 2){
                j--;
            }
            else if(dir == 3){
                i--;
            }
            
            if(i < 0){
                i++;
                break;
            }
            else if(j < 0){
                j++;
                break;
            }
            else if(j > arr.length){
                j--;
                break;
            }
            else if(i > arr.length){
                i--;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
