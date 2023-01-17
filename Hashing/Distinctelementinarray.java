import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Distinctelementinarray {

    public static void hashMapPractice(){
        HashMap<Integer, Integer>  hashMap = new HashMap<>();
        hashMap.put(3, 1);
        hashMap.put(5, 1);
        hashMap.put(6, 1);
        hashMap.put(7, 6);
        hashMap.put(1, 1);

        System.out.println(hashMap.get(7));
        int target = 5;
        System.out.println(hashMap.get(target));
        if (hashMap.get(target) == null){
            System.out.println("Does n't exists..!");
        }else{
            System.out.println("Does exists, with value " + hashMap.get(target));
        }
    }


    public static void frequecyOfElement(int[] array){
    
        HashMap<Integer, Integer>  hashMap = new HashMap<>();

        for(int i = 0; i < array.length; i ++){
            if(hashMap.containsKey(array[i])){
                int count = hashMap.get(array[i]);
                hashMap.put(array[i], count + 1);
             //   System.out.println("Key: " + key + ", Value: " + value);   
            }else{
                hashMap.put(array[i], 1);
            }
        }
        for(Entry<Integer, Integer> entry : hashMap.entrySet()){
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);   
        }
    }
    public static void main (String[] args){
        int[] array = {2, 2, 3, 4, 5, 7, 3, 7} ;
        frequecyOfElement(array);
        hashMapPractice();
    }
}
                