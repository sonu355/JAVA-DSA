public class Hars {
    public static void main(String[] args){
        int[] arr = new int[]{3, 4, 6, 4, 5};
        int count = 1;
          for(int i=0; i < arr.length; i++){
              if (arr[i] != arr[i+1]){
                    count++;
               }
        }
        System.out.println("distinct element"+count);
    }
}
