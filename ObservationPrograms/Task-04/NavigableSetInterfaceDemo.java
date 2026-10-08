import java.util.TreeSet;
import java.util.NavigableSet;

public class NavigableSetInterfaceDemo {
    public static void main(String[] args) {

        NavigableSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("Navigable Set: " + set);

        // lower()
        System.out.println("Lower than 30: " + set.lower(30));

        // floor()
        System.out.println("Floor of 30: " + set.floor(30));

        // ceiling()
        System.out.println("Ceiling of 35: " + set.ceiling(35));

        // higher()
        System.out.println("Higher than 30: " + set.higher(30));

        // pollFirst()
        System.out.println("Removed first element: " + set.pollFirst());
        System.out.println("Set after pollFirst: " + set);

        // pollLast()
        System.out.println("Removed last element: " + set.pollLast());
        System.out.println("Set after pollLast: " + set);

        // descendingSet()
        System.out.println("Descending Set: " + set.descendingSet());
    }
}