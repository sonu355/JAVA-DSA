
import java.util.Set;
import java.util.TreeSet;



public class Treesetss {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
            set.add(25);
            set.add(43);
            set.add(55);
            set.add(22);
            set.add(98);
            System.out.println(set);
            //[25, 43, 55, 22, 98] = output

            set.remove(43);
            System.out.println(set);

            System.out.println(set.contains(43));

            set.isEmpty();

            set.size();

            set.clear();
    }
}
