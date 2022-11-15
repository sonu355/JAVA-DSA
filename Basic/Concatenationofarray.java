class Solution{
    public int[] getConcatenation(int[] nums){
        int[] arr = new int[nums.length*2];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            arr[i] = nums[i];
            arr[n+i] = nums[i];
        }
        return arr;
    }
}



public class Concatenationofarray {
    public void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = new int[]{3, 4, 7, 9, 2 };
        int[] result = sol.getConcatenation(nums);
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + ",");
        }
    }
}
