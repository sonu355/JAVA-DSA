

public class Power {
    public static void main(String[] args) {
        int x = 5;
        int n = 5;
        int xy = numPower(x, n);
        System.out.println(xy);
    }
    public static int numPower(int x, int n) {
        if(n == 0){
          return 1;
        }
        int abc = numPower(x, n - 1);
        int xy = abc * x;
        return xy;
    }
}
