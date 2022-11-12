import java.util.LinkedList;
import java.util.Queue;

public class LearnlinkedlistQueue {
    public static void main(String[] args) {
       Queue<Integer> value = new LinkedList<>();
            value.offer(59);
            value.offer(17);
            value.offer(26);
            value.offer(96);
            value.offer(25);
        
        System.out.println(value);

        System.out.println(value.peek());

        value.poll();
        System.out.println(value);

       
    }
}
