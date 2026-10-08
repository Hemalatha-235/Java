import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInterfaceDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("List: " + list);

        ListIterator<Integer> iterator = list.listIterator();

        // hasNext(), next(), nextIndex()
        System.out.println("Forward Traversal:");

        while (iterator.hasNext()) {
            System.out.println("Index: " + iterator.nextIndex()
                    + ", Element: " + iterator.next());
        }

        // hasPrevious(), previous(), previousIndex()
        System.out.println("Backward Traversal:");

        while (iterator.hasPrevious()) {
            System.out.println("Index: " + iterator.previousIndex()
                    + ", Element: " + iterator.previous());
        }

        // add()
        iterator = list.listIterator();
        iterator.add(5);

        System.out.println("After add: " + list);

        // set()
        iterator = list.listIterator();
        iterator.next();
        iterator.set(15);

        System.out.println("After set: " + list);

        // remove()
        iterator = list.listIterator();
        iterator.next();
        iterator.remove();

        System.out.println("After remove: " + list);
    }
}