import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorInterfaceDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("List: " + list);

        Iterator<Integer> iterator = list.iterator();

        // hasNext() and next()
        System.out.println("Elements using Iterator:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // remove()
        iterator = list.iterator();

        while (iterator.hasNext()) {
            int value = iterator.next();

            if (value == 30) {
                iterator.remove();
            }
        }

        System.out.println("After removing 30: " + list);

        // forEachRemaining()
        iterator = list.iterator();

        System.out.println("Remaining elements:");

        iterator.forEachRemaining(value -> System.out.println(value));
    }
}