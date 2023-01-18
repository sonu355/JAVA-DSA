public class Nextgreaterele {
    public static void nextGreater(int[] arr, int k){
        
        for(int i = 0; i < arr.length; i++){
            int next = -1;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + ":" + next);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,5,8,3,4,7,2,4};
        int k = 3;
        nextGreater(arr, k);
    }
}
