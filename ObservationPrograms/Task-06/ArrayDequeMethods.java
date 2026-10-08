import java.util.ArrayDeque;

public class ArrayDequeMethods {
    public static void main(String[] args) {

        ArrayDeque<String> customers = new ArrayDeque<>();

        // 1. addFirst(E e)
        customers.addFirst("Rahul");
        customers.addFirst("Arjun");
        System.out.println("After addFirst(): " + customers);

        // 2. addLast(E e)
        customers.addLast("Priya");
        customers.addLast("Sneha");
        System.out.println("After addLast(): " + customers);

        // 3. offerFirst(E e)
        customers.offerFirst("Kiran");
        System.out.println("After offerFirst(): " + customers);

        // 4. offerLast(E e)
        customers.offerLast("Anjali");
        System.out.println("After offerLast(): " + customers);

        // 5. peekFirst()
        System.out.println("First customer: " + customers.peekFirst());

        // 6. peekLast()
        System.out.println("Last customer: " + customers.peekLast());

        // 7. pollFirst()
        System.out.println("Removed first customer: " + customers.pollFirst());
        System.out.println("After pollFirst(): " + customers);

        // 8. pollLast()
        System.out.println("Removed last customer: " + customers.pollLast());
        System.out.println("After pollLast(): " + customers);
    }
}