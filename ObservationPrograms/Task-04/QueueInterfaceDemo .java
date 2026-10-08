import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceDemo {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // add(E e)
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println("Queue after add: " + queue);

        // offer(E e)
        queue.offer(40);
        System.out.println("Queue after offer: " + queue);

        // element()
        System.out.println("Head using element(): " + queue.element());

        // peek()
        System.out.println("Head using peek(): " + queue.peek());

        // remove()
        System.out.println("Removed using remove(): " + queue.remove());
        System.out.println("Queue after remove: " + queue);

        // poll()
        System.out.println("Removed using poll(): " + queue.poll());
        System.out.println("Queue after poll: " + queue);
    }
}