import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Pattren7 {
    public static void main(String[] args){
        int n = 5; 
        // int st = 1;
        // int sp = 0;
      /*  for(int i = 1; i <= n; i++){
            for(int j = 0; j <= sp; j++){
                System.out.print("\t");
            }
            for(int j = 1; j <= st;j++){
                System.out.print("*\t");
            }
            sp++;
            System.out.println();
        }*/ 
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == j){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
