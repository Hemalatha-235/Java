import java.util.ArrayDeque;
import java.util.Deque;

public class DequeInterfaceDemo {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        // addFirst() and addLast()
        deque.addFirst(20);
        deque.addLast(30);
        System.out.println("After addFirst and addLast: " + deque);

        // offerFirst() and offerLast()
        deque.offerFirst(10);
        deque.offerLast(40);
        System.out.println("After offerFirst and offerLast: " + deque);

        // peekFirst() and peekLast()
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // removeFirst() and removeLast()
        System.out.println("Removed first: " + deque.removeFirst());
        System.out.println("Removed last: " + deque.removeLast());
        System.out.println("After removeFirst and removeLast: " + deque);

        // pollFirst() and pollLast()
        System.out.println("Polled first: " + deque.pollFirst());
        System.out.println("Polled last: " + deque.pollLast());
        System.out.println("After pollFirst and pollLast: " + deque);
    }
}