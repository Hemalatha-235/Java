import java.util.HashSet;
import java.util.Set;

public class SetInterfaceDemo {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        // add(E e)
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);
        System.out.println("Set: " + set);

        // remove(Object o)
        set.remove(20);
        System.out.println("After removing 20: " + set);

        // contains(Object o)
        System.out.println("Contains 10: " + set.contains(10));

        // size()
        System.out.println("Size of set: " + set.size());

        // isEmpty()
        System.out.println("Is set empty: " + set.isEmpty());

        // clear()
        set.clear();
        System.out.println("After clear: " + set);

        System.out.println("Is set empty: " + set.isEmpty());
    }
}