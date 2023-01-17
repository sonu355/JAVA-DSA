public class Twosum {
    // public static int[] twoSum(int[] nums, int target) {
    //     int[] result = {-1, -1};
    //     for(int i = 0; i < nums.length; i++){
    //         for(int j = i + 1; j < nums.length; j++){
    //             if(nums[i] + nums[j] == target){
    //                 result[0] = i;
    //                 result[1] = j;
    //                 return result;
    //             }
    //         }
    //     }
    //     return result;
    // }
    public static int[] twoSumm(int[] nums, int targ) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; i < nums.length; j++){
                if(targ - nums[i] == nums[j]){
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {2, 4, 7, 1};
        int targ = 11;
        int [] result = twoSumm(nums, targ);
        System.out.println(result[0] + " " + result[1]);
    }
}
