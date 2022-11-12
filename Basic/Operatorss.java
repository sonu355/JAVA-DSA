public class Operatorss {
    public static void main(String[] args) {
        int m = 6, n = 4;
        int r1 = m + n;
        int r2 = m - n;
        int r3 = m * n;
        int r4 = m / n;
        double r5 = (double)m / n;
        int r6 = m % n;
        n = n + m; // is same as 
        n += m;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);

        // Ternary Operator
         //  if(i > 6){
        //     j = 2;
        //  }else{
        //     j = 1;
        //  }

        int i = 7;
         int j = 0;
       
         j = i > 6 ? 1 : 2;
            System.out.println(j);
        

       
        
    }
}
