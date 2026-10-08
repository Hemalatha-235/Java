import java.util.TreeSet;

public class TreeSetMethods {
    public static void main(String[] args) {

        TreeSet<Integer> marks = new TreeSet<>();

        // 1. add(E e)
        marks.add(85);
        marks.add(72);
        marks.add(95);
        marks.add(60);
        marks.add(80);
        marks.add(85);   // Duplicate will not be added

        System.out.println("After add(): " + marks);

        // 2. remove(Object o)
        marks.remove(60);
        System.out.println("After remove(): " + marks);

        // 3. contains(Object o)
        System.out.println("Contains 80? " + marks.contains(80));
        System.out.println("Contains 70? " + marks.contains(70));

        // 4. first()
        System.out.println("First element: " + marks.first());

        // 5. last()
        System.out.println("Last element: " + marks.last());

        // 6. higher(E e)
        System.out.println("Element higher than 80: " + marks.higher(80));

        // 7. lower(E e)
        System.out.println("Element lower than 80: " + marks.lower(80));

        // 8. ceiling(E e)
        System.out.println("Element ceiling 82: " + marks.ceiling(82));

        // 9. floor(E e)
        System.out.println("Element floor 82: " + marks.floor(82));

        // 10. pollFirst()
        System.out.println("Removed first: " + marks.pollFirst());
        System.out.println("After pollFirst(): " + marks);

        // 11. pollLast()
        System.out.println("Removed last: " + marks.pollLast());
        System.out.println("After pollLast(): " + marks);
    }
}