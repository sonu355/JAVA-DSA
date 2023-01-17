import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.lang.model.element.Element;

public class Arraylist{
   public static void main(String[] args) {
      List<Integer> numberr = new LinkedList<>();

        numberr.add(40);
        numberr.add(10);  System.out.println(numberr);

        System.out.println(numberr.contains(70));

        System.out.println(numberr.get(2));

        numberr.add(30);
        numberr.add(50);
        numberr.add(20);

        System.out.println(numberr);
            numberr.add(4, 60);
        // System.out.println(numberr);

        // System.out.println(numberr.contains(70));

        // System.out.println(numberr.get(2));

        numberr.remove(3);
        System.out.println(numberr);

        List<Integer> num = new ArrayList<>();
            num.add(56);
            num.add(79);

        numberr.addAll(num);
        System.out.println(numberr);

        numberr.set(3, 55);
        System.out.println(numberr);

        for(int i=0; i < numberr.size(); i++){
            System.out.println("Element is " + numberr.get(i));
        }

        for(Integer  Element : numberr){
            System.out.println("foreach " + Element);
        }

        Iterator<Integer> It = numberr.iterator();
            while(It.hasNext()){
                System.out.println("Iterator is " + It.next()) ;
            }
   }
}