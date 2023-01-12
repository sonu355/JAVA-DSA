public class Rotatenum {
    public static void main(String[] args) {
        int d = 12345;
        int n = 2;
        int nod = 0;
        int div = d % (int)Math.pow(10, n);
        System.out.println(div);
        while(d != 0){
            d = d / 10;
            nod++;
        }
        int temp = d;
        temp = temp / (int)Math.pow(10, n);
        System.out.println(temp);
        System.out.println(nod);
        int m = div * (int)Math.pow(10, nod - n) + temp;
        System.out.println(m);
    }
}
