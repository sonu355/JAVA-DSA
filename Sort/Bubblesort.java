package Sort;
public class Bubblesort {
    void bubbleSort(int arr[]){
        int n = arr.length;
         for(int i=0; i < n-1; i++){
            int flag = 0;
            for(int j=0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0){
                break;
            }
        }
    }

    void printArray(int arr[]){
        int n = arr.length;
        for(int i=0; i < n; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Bubblesort ob = new Bubblesort();
        int array[] = {8, 5, 3, 7, 2, 4, 1, 9, 6, 10};
        ob.bubbleSort(array);
        System.out.println("Sorted array : " );
        ob.printArray(array);
    }
}

