public class Hello{
    public static void main(String[] args) {
        System.out.println("Hello HArshal");
        int n = 6426578;
        int nod = 0;
        int temp = n;
            while(temp != 0){
                temp = temp / 10;
                nod++;
            }
            System.out.println(nod);
        while(n != 0){
            int q = n % 10;
            n = n / 10;
            System.out.println(q);
        }
    }
}