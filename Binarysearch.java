public class Binarysearch {
    public static int binarySearch(int arr[],int left,int right, int target) {
        int mid = (right + left)/2;
        while(left <= right){
            if(arr[mid] == target){
                return mid;
            }if(arr[mid] > target){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15, 16, 17, 18, 19};
        int target = 11;
        int right = arr.length - 1;
        int result = binarySearch(arr, 0, right, target);
        if(result == -1){
            System.out.println("Element is not found");
        }else{
            System.out.println("Element is at index" + result);
        }
    }
}
