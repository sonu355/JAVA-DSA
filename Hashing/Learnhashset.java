import java.util.HashSet;
import java.util.Set;

public class Learnhashset {
    public static void main(String[] args) {
        Set <Integer> set = new HashSet<>();

        set.add(60);
        set.add(50);
        set.add(20);
        set.add(40);
        set.add(10);

        System.out.println(set);

        System.out.println(set.contains(40));
        System.out.println(set.isEmpty());

        System.out.println(set.size());

        

    }
}
