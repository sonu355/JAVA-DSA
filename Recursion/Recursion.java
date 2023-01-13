public class Recursion {
    public static void main(String[] args) throws Exception {
        int x  = 6;
        int n = numFactorial(x);
        System.out.println(n);
    }
    public static int numFactorial(int x) {
            if(x == 0){
                return 1;
            }
            int fnm = numFactorial(x - 1);
            int fn = x * fnm;
            return fn;
       } 
    }

