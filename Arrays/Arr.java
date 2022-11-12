//this is assignment implications of array
public class Arr {
    public static void main(String[] args){
        int[] arr = new int[5];

        arr[0] = 56;
        arr[1] = 78;
        arr[2] = 50;
        arr[3] = 96;
        arr[4] = 46;

        int[] arr1 = arr;
        arr1[2] = 80;

        for(int i=0; i < arr.length; i++){
            System.out.println(arr1[i]);
        }
    }
}

//


