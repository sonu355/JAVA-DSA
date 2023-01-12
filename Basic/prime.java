public class prime {
    public static void main(String[] args) {
      //  int t = 5;
      int n1 = 1;
      int n2 = 100;
        for(int i = n1; i <= n2; i++){
        //    int n = (3, 6, 7, 11, 23);
            int count = 0;
            for(int div = 2; div*div <= i; div++){
                if (i % div == 0){
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(i);
            }
        }   
    }
}
