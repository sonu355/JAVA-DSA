//Swapping of Array
public class Arrswap {
    public static void swap(int[] arr, int i, int j) {
        
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    public static void main(String[] args) {
        int[] arr = new int[5];//new indicates allcation of new memory for array

        arr[0] = 45;
        arr[1] = 55;
        arr[2] = 65;
        arr[3] = 75;
        arr[4] = 85;

      swap(arr, 0, 4);

      for(int i=0; i < arr.length; i++){
        System.out.println(arr[i]);
      }
        
        
    }
}
