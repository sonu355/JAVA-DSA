import java.util.Stack;

public class Stacks {
    public static void main(String[] args){
        Stack <Integer> st = new Stack <> ();//representation of stacks


         st.push(10);
         st.push(20);
         st.push(30);
         st.push(40);

         System.out.println(st);
         System.out.println(st.size() + " " + st.peek());

         
         st.pop();
         System.out.println(st);
    }
}
