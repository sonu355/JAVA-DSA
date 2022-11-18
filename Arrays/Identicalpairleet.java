class Solution{
    public int identicalPair(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[j] == nums[i]){
                    count++;
                }
            }
        }
        return count;
    }

}



public class Identicalpairleet{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = new int[]{2,3,1,3,2,8,1,3,1};
        int num = sol.identicalPair(nums);
        System.out.println(num);
    }
}