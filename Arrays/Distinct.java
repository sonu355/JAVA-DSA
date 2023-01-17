public class Distinct {
    public static void main(String[] args) {
        int[] arr = new int []{2, 3, 5, 8 ,2, 3 ,2};
        int visited = -1;
        for(int i = 0 ; i < arr.length; i++){
            int visit = 0;
            for(int j = 0; i < i; j++){
                if(arr[i] == arr[j]){
                    visit++;
                    arr[j] = visited;
                }
            }
            if(arr[i] == visited){
                System.out.println(visit);
            }
        }
    }
}
