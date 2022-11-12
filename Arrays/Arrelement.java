public class Arrelement{
    public static void main(String[] args) {
              int[] arr = new int[] {25, 87, 56, 43, 43, 94};
             // int element = 0;
              int count = 1;
                
            for(int i=0; i < arr.length - 1; i++){
                if(arr[i] != arr[i+1]){
                    count++;
                }
            }
            System.out.println(count);
    }
}