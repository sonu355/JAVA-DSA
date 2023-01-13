import java.util.Scanner;

    public class Add {
            public static int addNum(int x1, int x2){
                int sum = x1 + x2;
                return sum;
        }
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int x1 = scn.nextInt();
            int x2 = scn.nextInt();
           // int sum = addNum(x1, x2);
            System.out.println(addNum(x1, x2));
            scn.close();
        }
    }
