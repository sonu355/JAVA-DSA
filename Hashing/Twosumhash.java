import java.util.HashMap;

public class Twosumhash {
    public static int[] twoSumHash(int[] array, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            if(hashmap.containsKey(target - array[i]) ){
                result[1] = i;
                result[0] = hashmap.get(target - array[i]);
                return result;
            }  
            hashmap.put(array[i],i);
        }
        return result;
    } 
    public static void main(String[] args) {
        int[] array = {2,4,3,1};
        int target = 7;
        int[] result =  twoSumHash(array, target);
        System.out.println(result[0] + " " + result[1]);
    }
}
