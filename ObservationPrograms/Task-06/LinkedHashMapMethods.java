import java.util.LinkedHashMap;

public class LinkedHashMapMethods {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> products = new LinkedHashMap<>();

        // 1. put(K key, V value)
        products.put(101, "Laptop");
        products.put(102, "Mobile");
        products.put(103, "Headphones");
        products.put(104, "Keyboard");

        System.out.println("After put(): " + products);

        // 2. get(Object key)
        System.out.println("Product with ID 102: " + products.get(102));

        // 3. remove(Object key)
        products.remove(103);
        System.out.println("After remove(): " + products);

        // 4. containsKey(Object key)
        System.out.println("Contains key 101? " + products.containsKey(101));
        System.out.println("Contains key 105? " + products.containsKey(105));

        // 5. keySet()
        System.out.println("Keys: " + products.keySet());

        // 6. values()
        System.out.println("Values: " + products.values());

        // 7. entrySet()
        System.out.println("Entries: " + products.entrySet());
    }
}