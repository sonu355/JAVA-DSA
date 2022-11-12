import java.util.Set;
import java.util.HashSet;
public class Hashsetsss {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
            set.add(25);
            set.add(43);
            set.add(55);
            set.add(22);
            set.add(98);
            System.out.println(set);
            //[55, 43, 22, 98, 25] = output

            set.remove(43);
            System.out.println(set);

            System.out.println(set.contains(43));

            set.isEmpty();

            set.size();

            set.clear();
    }
}
