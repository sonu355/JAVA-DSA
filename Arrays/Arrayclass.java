import java.util.Arrays;

public class Arrayclass {
    public static void main(String[] args) {
        /*int [] a = {3, 46, 14, 90, 56, 87, 45, 98};
         Arrays.sort(a);// directly sorts the array
            
            for(int i : a){
                System.out.println(i + " ");
            }*/

            int[] numbers = {3, 14, 45, 56, 87, 90, 98};
                int index = Arrays.binarySearch(numbers, 56 );
                System.out.println("The index of element 56 array is " + index);

                Arrays.fill(numbers, 69);
                for(int i : numbers){
                    System.out.println(i + " ");
                }
    }
}
