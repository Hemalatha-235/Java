import java.util.LinkedList;

public class LinkedListMethods {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        // 1. add(E e)
        cities.add("Hyderabad");
        cities.add("Chennai");
        cities.add("Bangalore");
        System.out.println("After add(): " + cities);

        // 2. addFirst(E e)
        cities.addFirst("Mumbai");
        System.out.println("After addFirst(): " + cities);

        // 3. addLast(E e)
        cities.addLast("Delhi");
        System.out.println("After addLast(): " + cities);

        // 4. get(int index)
        System.out.println("Element at index 2: " + cities.get(2));

        // 5. getFirst()
        System.out.println("First city: " + cities.getFirst());

        // 6. getLast()
        System.out.println("Last city: " + cities.getLast());

        // 7. remove(int index)
        cities.remove(2);
        System.out.println("After remove(index): " + cities);

        // 8. remove(Object o)
        cities.remove("Chennai");
        System.out.println("After remove(object): " + cities);

        // 9. removeFirst()
        String first = cities.removeFirst();
        System.out.println("Removed first city: " + first);
        System.out.println("List after removeFirst(): " + cities);

        // 10. removeLast()
        String last = cities.removeLast();
        System.out.println("Removed last city: " + last);
        System.out.println("List after removeLast(): " + cities);

        // 11. offer(E e)
        cities.offer("Pune");
        System.out.println("After offer(): " + cities);

        cities.offer("Kolkata");
        System.out.println("After another offer(): " + cities);

        // 12. peek()
        System.out.println("Head using peek(): " + cities.peek());
        System.out.println("List after peek(): " + cities);

        // 13. poll()
        String removed = cities.poll();
        System.out.println("Removed using poll(): " + removed);
        System.out.println("List after poll(): " + cities);
    }
}