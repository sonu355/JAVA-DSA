public class Pattern5 {
    public static void main(String[] args) {
        int n = 5;
        int sp = n / 2;
        int st = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }
            for(int j = 1; i <= st; j++){
                System.out.println("*");
            }
            sp--;
            st += 2;
            System.out.println();
        }
    }
}
