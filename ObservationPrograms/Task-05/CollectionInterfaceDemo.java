import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterfaceDemo {
    public static void main(String[] args) {

        Collection<Integer> c = new ArrayList<>();

        // add()
        c.add(10);
        c.add(20);
        c.add(30);
        System.out.println("After add: " + c);

        // addAll()
        Collection<Integer> c2 = new ArrayList<>();
        c2.add(40);
        c2.add(50);

        c.addAll(c2);
        System.out.println("After addAll: " + c);

        // remove()
        c.remove(20);
        System.out.println("After remove: " + c);

        // contains()
        System.out.println("Contains 30: " + c.contains(30));

        // containsAll()
        System.out.println("Contains all c2: " + c.containsAll(c2));

        // size()
        System.out.println("Size: " + c.size());

        // isEmpty()
        System.out.println("Is empty: " + c.isEmpty());

        // iterator()
        System.out.print("Elements using Iterator: ");
        Iterator<Integer> it = c.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println();

        // removeAll()
        c.removeAll(c2);
        System.out.println("After removeAll: " + c);

        // clear()
        c.clear();
        System.out.println("After clear: " + c);

        // isEmpty() after clear
        System.out.println("Is empty: " + c.isEmpty());
    }
}