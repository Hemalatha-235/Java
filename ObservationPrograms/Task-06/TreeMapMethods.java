import java.util.TreeMap;

public class TreeMapMethods {
    public static void main(String[] args) {

        TreeMap<Integer, String> employees = new TreeMap<>();

        // 1. put(K key, V value)
        employees.put(105, "Rahul");
        employees.put(101, "Priya");
        employees.put(110, "Arjun");
        employees.put(103, "Sneha");
        employees.put(108, "Kiran");

        System.out.println("After put(): " + employees);

        // 2. get(Object key)
        System.out.println("Employee with ID 103: " + employees.get(103));

        // 3. remove(Object key)
        employees.remove(110);
        System.out.println("After remove(): " + employees);

        // 4. containsKey(Object key)
        System.out.println("Contains key 105? "
                           + employees.containsKey(105));

        // 5. containsValue(Object value)
        System.out.println("Contains value Kiran? "
                           + employees.containsValue("Kiran"));

        // 6. firstKey()
        System.out.println("First key: " + employees.firstKey());

        // 7. lastKey()
        System.out.println("Last key: " + employees.lastKey());

        // 8. higherKey(K key)
        System.out.println("Key higher than 103: "
                           + employees.higherKey(103));

        // 9. lowerKey(K key)
        System.out.println("Key lower than 103: "
                           + employees.lowerKey(103));

        // 10. ceilingKey(K key)
        System.out.println("Key ceiling 104: "
                           + employees.ceilingKey(104));

        // 11. floorKey(K key)
        System.out.println("Key floor 104: "
                           + employees.floorKey(104));

        // 12. entrySet()
        System.out.println("Entries: " + employees.entrySet());
    }
}