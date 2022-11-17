class Sol{
    public int[] getSoln(int[] arr){
        int[] sol = new int[arr.length] ;   
       sol[0] = arr[0];
        for(int i = 1; i < arr.length; i++){   
            sol[i] = sol[i - 1] + arr[i];
          
        }
        return sol;
    }
}
        
public class Sumofarray {
    public void printArray(int[] sol){
        for(int i = 0; i < sol.length; i++){
        System.out.print(sol[i]);
        }
    }

    public static void main(String[] args) {
        Sol solObject = new Sol();
        int[] arr = new int[]{1,2,3,9,8};
        int[] result = solObject.getSoln(arr);
        System.out.print("{");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + ",");
        }
        System.out.println("}");
    }
}
