
import java.util.Map;
import java.util.TreeMap;


public class TreeMapss {
    public static void main(String[] args){
        Map<String, Integer> numbers = new TreeMap<>();
            numbers.put("One", 1);
            numbers.put("Two", 2);
            numbers.put("Three", 3);
            numbers.put("Four", 4);
            numbers.put("Five", 5);

            numbers.putIfAbsent("Two", 23);

            System.out.println(numbers);

            for(Map.Entry<String, Integer> e: numbers.entrySet()) {
                System.out.println(e);

                System.out.println(e.getKey());
                System.out.println(e.getValue());
            }

            for(String key : numbers.keySet()){
                System.out.println(key);
            }

            for(Integer value : numbers.values() ){
                System.out.println(value);
            }
    }
}
