import java.util.Comparator;
import java.util.PriorityQueue;

public class Learnpriorityqueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
            
            pq.offer(40);
            pq.offer(10);
            pq.offer(20);
            pq.offer(50);
            pq.offer(30);
           
          
        System.out.println(pq);
        
        System.out.println("the top most element is " + pq.peek());

        pq.poll();
         
        System.out.println(pq);

        PriorityQueue<Integer> pqr = new PriorityQueue<>(Comparator.reverseOrder());
        //it revserses the order of set from min to max element first
            pqr.offer(40);
            pqr.offer(10);
            pqr.offer(20);
            pqr.offer(50);
            pqr.offer(30);    
        
            System.out.println(pqr);

            System.out.println(pqr.peek());
    }
}
