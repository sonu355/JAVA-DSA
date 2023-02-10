public class Pattern8 {
    public static void main(String[] args) {
        int n = 5;
     /*    int sp = n - 1;
        int st = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= st; j++){
                System.out.print("*\t");
            }
            sp--;
            System.out.println();
        } */
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i + j == n + 1 ){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
