/*import java.util.Scanner;
public class Main        
public static int Fact(int n, int r){
            int rv = 1;

            for(int i=1; i <= n; i++){
                rv = rv * 1;
            }
            return rv;
        }
    


        public static void main(String[] args){
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();
            int r = scn.nextInt();

            int nfact = Fact(n);
            int nmrfact = Fact(n-r);

            int npr = nfact/nmrfact;
            System.out.println(n+"p"+r+"="npr);

        
        }
    */
    import java.util.Scanner;
    public class Lec75{
        public static void printMyName(String name){
            System.out.println(name);
            return;
        }
        public static void main(String[] args){
            Scanner scn = new Scanner (System.in);
            String name = scn.next();

            printMyName(name);   //call the function
        }

    }