import java.util.Vector;

public class VectorMethods {
    public static void main(String[] args) {

        Vector<String> subjects = new Vector<>();

        // 1. add(E e)
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("C");
        System.out.println("After add(): " + subjects);

        // 2. addElement(Object obj)
        subjects.addElement("C++");
        System.out.println("After addElement(): " + subjects);

        // 3. get(int index)
        System.out.println("Element at index 1: " + subjects.get(1));

        // 4. set(int index, E element)
        subjects.set(2, "DSA");
        System.out.println("After set(): " + subjects);

        // 5. remove(int index)
        subjects.remove(1);
        System.out.println("After remove(index): " + subjects);

        // 6. removeElement(Object obj)
        subjects.removeElement("C++");
        System.out.println("After removeElement(): " + subjects);

        // 7. size()
        System.out.println("Size of Vector: " + subjects.size());

        // 8. capacity()
        System.out.println("Capacity of Vector: " + subjects.capacity());

        // 9. contains(Object o)
        System.out.println("Contains Java? " + subjects.contains("Java"));
        System.out.println("Contains Python? " + subjects.contains("Python"));
    }
}