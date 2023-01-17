public class All {
    public static void main(String[] args){
        int[] arr = new int[] {1, 2, 3, 3, 2, 1, 1, 3, 2};
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    arr[j] = visited;
                }
            }
            if(arr[i] != visited){
                System.out.println(arr[i] + " " + count);
            }
        }
    }
}
