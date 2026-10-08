import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListMethods {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        // 1. add(E e)
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("After add(): " + fruits);

        // 2. add(int index, E element)
        fruits.add(1, "Orange");
        System.out.println("After add(index, element): " + fruits);

        // 3. get(int index)
        System.out.println("Element at index 2: " + fruits.get(2));

        // 4. set(int index, E element)
        fruits.set(2, "Grapes");
        System.out.println("After set(): " + fruits);

        // 5. remove(int index)
        fruits.remove(1);
        System.out.println("After remove(index): " + fruits);

        // 6. remove(Object o)
        fruits.remove("Apple");
        System.out.println("After remove(object): " + fruits);

        // 7. contains(Object o)
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // 8. size()
        System.out.println("Size of list: " + fruits.size());

        // 9. isEmpty()
        System.out.println("Is list empty? " + fruits.isEmpty());

        // Add duplicate elements for indexOf() and lastIndexOf()
        fruits.add("Mango");
        fruits.add("Apple");
        fruits.add("Mango");

        // 10. indexOf(Object o)
        System.out.println("First index of Mango: " + fruits.indexOf("Mango"));

        // 11. lastIndexOf(Object o)
        System.out.println("Last index of Mango: " + fruits.lastIndexOf("Mango"));

        // 12. sort(Comparator)
        fruits.sort(Comparator.naturalOrder());
        System.out.println("After sorting: " + fruits);

        // 13. clear()
        fruits.clear();
        System.out.println("After clear(): " + fruits);

        // Check whether list is empty
        System.out.println("Is list empty now? " + fruits.isEmpty());
    }
}