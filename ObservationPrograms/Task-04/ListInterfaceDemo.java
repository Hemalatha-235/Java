import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class ListInterfaceDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(10);
        list.add(20);
        list.add(10);
        System.out.println("List: " + list);

        list.add(1, 50);
        System.out.println("After adding 50 at index 1: " + list);

        System.out.println("Element at index 2: " + list.get(2));

        list.set(2, 100);
        System.out.println("After replacing index 2: " + list);

        list.remove(2);
        System.out.println("After removing index 2: " + list);

        System.out.println("First index of 10: " + list.indexOf(10));

        System.out.println("Last index of 10: " + list.lastIndexOf(10));

        System.out.println("SubList: " + list.subList(1, 3));

        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted List: " + list);
    }
}