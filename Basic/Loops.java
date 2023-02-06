public class Loops {
    public static void main(String[] args) {
        //while
        // int i = 5;
        // while(i <= 5){
        //     System.out.println("HellO");
        //     i++;
        // }
        // //do while
        // int n = 7;
        // while(i <= 6){
        //     i += 1;
        //     System.out.println("hello");
        // }
        int[] arr = {2, 3, 5, 8, 4};
        int[] nums = new int[arr.length];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            nums[i] = sum;
        }
        for(int i = 0; i < nums.length; i++){
            System.out.print(  nums[i] + " " );
        }
    }
}    
