package Sort;

public class Selectionsort {
    void sort(int arr[]){
        int n = arr.length;
            for(int i = 0; i < n - 1 ; i++){
                int min = i ;
                    for(int j = i + 1; j < n; j++){
                        if(arr[j] < arr[min]){
                            min = j;
                        }
                    }
                int temp = arr[min];
               arr[min] = arr[i];
                arr[i] = temp;
            }
    }

    static void printArray(int arr[]){
        int n = arr.length;
            for(int i = 0; i < n; ++i)
                System.out.print(arr[i] + " ");
            
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {23, 45, 71, 12, 99, 67, 56};

        Selectionsort ss = new Selectionsort();
            ss.sort(arr);
            System.out.println("sorted array : ");
            printArray(arr);
    }
}