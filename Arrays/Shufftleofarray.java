class Soluti{
    public int[] shuffle(int[] nums, int n){
        int[] arr = new int[n*2];
        for(int i = 0; i < n; i++){
            arr[2*i] = nums[i];
            arr[2*i+1] = nums[i + n];
        }    
        return arr;
    }
}
    /*
        // int a = 0;
        // int b = n;
        for(int i = 0; i < 2 * n; i = i + 2){
            arr[i] = nums[i];
            arr[i+1] = nums[b];
            a++;
            b++;
        }
     */



public class Shufftleofarray {
    // public void printArray(int[] arr){
    //     for(int i = 0; i <  arr.length; i++)[
    //         System.out.println(arr[i]);
    //     ]
    
    public static void main(String[] args) {
        Soluti shf = new Soluti();
        int[] nums = new int[]{2, 3, 4, 5, 6, 8};
       int[] result = shf.shuffle(nums, 3);
            for(int i = 0; i < result.length; i++){
                System.out.println(result[i]);
            }
        
    }
}
