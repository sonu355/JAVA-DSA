import java.util.HashMap;
public class Twosum {
    public static int[] twoSum(int[] array, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for(int i = 0; i < array.length; i++){
            if(map.containsKey(target - array[i])){
                arr[1] = i;
                arr[0] = map.get(target - array[i]);
                return arr;
            }
            map.put(array[i], i);
        }
    return arr;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int target = 7;
        int[] arr = twoSum(array, target);
        System.out.println(arr);
    }
}
