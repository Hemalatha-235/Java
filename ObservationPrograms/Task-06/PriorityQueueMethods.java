import java.util.PriorityQueue;

public class PriorityQueueMethods {
    public static void main(String[] args) {

        PriorityQueue<Integer> tasks = new PriorityQueue<>();

        // 1. add(E e)
        tasks.add(40);
        tasks.add(10);
        tasks.add(30);

        System.out.println("After add(): " + tasks);

        // 2. offer(E e)
        tasks.offer(20);
        System.out.println("After offer(): " + tasks);

        // 3. peek()
        System.out.println("Head using peek(): " + tasks.peek());
        System.out.println("Queue after peek(): " + tasks);

        // 4. poll()
        System.out.println("Removed using poll(): " + tasks.poll());
        System.out.println("Queue after poll(): " + tasks);

        // 5. remove(Object o)
        tasks.remove(30);
        System.out.println("After remove(30): " + tasks);

        // 6. contains(Object o)
        System.out.println("Contains 20? " + tasks.contains(20));
        System.out.println("Contains 50? " + tasks.contains(50));

        // 7. size()
        System.out.println("Size of PriorityQueue: " + tasks.size());
    }
}