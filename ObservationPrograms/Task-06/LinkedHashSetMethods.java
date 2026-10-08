import java.util.LinkedHashSet;

public class LinkedHashSetMethods {
    public static void main(String[] args) {

        LinkedHashSet<String> languages = new LinkedHashSet<>();

        // 1. add(E e)
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        languages.add("Java");   // Duplicate will not be added

        System.out.println("After add(): " + languages);

        // 2. contains(Object o)
        System.out.println("Contains Python? " + languages.contains("Python"));
        System.out.println("Contains HTML? " + languages.contains("HTML"));

        // 3. size()
        System.out.println("Size of LinkedHashSet: " + languages.size());

        // 4. remove(Object o)
        languages.remove("C");
        System.out.println("After remove(): " + languages);

        // 5. clear()
        languages.clear();
        System.out.println("After clear(): " + languages);

        // Check size after clearing
        System.out.println("Size after clear(): " + languages.size());
    }
}