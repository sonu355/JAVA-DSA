class Solution{
    public int[] getConcatenation(int[] nums){
        int[] arr = new int[nums.length * 2];
        int n = nums.length;
        for(int i = 0; i<nums.length; i++){
            arr[i] = nums[i];
            arr[i + n] = nums[i];
        }    
        return arr;
    }
}

public class ConcatenationofArray {

    public void printArray(int[] arr){
        for(int i = 0; i< arr.length; i ++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = new int[]{3, 4, 5, 6, 8, 90, 43, 32};
        int[] result = sol.getConcatenation(nums);
        for(int i = 0; i < result.length; i ++){
            System.out.print(result[i] + " ");
        }
    }
}
