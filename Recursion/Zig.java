import javax.swing.text.html.StyleSheet;

public class Zig {
    public static void main(String[] args) {
        int n = 3;
         zinZag(n);
    }
    public static void zinZag(int n){
        if(n == 0){
            return;
        }
        System.err.println("pre" + n);
        zinZag(n - 1);
        System.out.println("in" + n);
        zinZag(n - 1);
        System.out.println("out" + n);
    }
}
