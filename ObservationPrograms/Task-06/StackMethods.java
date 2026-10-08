import java.util.Stack;

public class StackMethods {
    public static void main(String[] args) {

        Stack<String> books = new Stack<>();

        // 1. push(E item)
        books.push("Java");
        books.push("DSA");
        books.push("Python");
        books.push("C++");
        System.out.println("After push(): " + books);

        // 2. peek()
        System.out.println("Top book using peek(): " + books.peek());
        System.out.println("Stack after peek(): " + books);

        // 3. pop()
        String removed = books.pop();
        System.out.println("Removed book using pop(): " + removed);
        System.out.println("Stack after pop(): " + books);

        // 4. empty()
        System.out.println("Is stack empty? " + books.empty());

        // 5. search(Object o)
        System.out.println("Position of DSA: " + books.search("DSA"));
        System.out.println("Position of Java: " + books.search("Java"));
    }
}