import java.util.Hashtable;
import java.util.Enumeration;

public class HashtableMethods {
    public static void main(String[] args) {

        Hashtable<Integer, String> countries = new Hashtable<>();

        // 1. put(K key, V value)
        countries.put(1, "India");
        countries.put(2, "Japan");
        countries.put(3, "Canada");
        countries.put(4, "Australia");

        System.out.println("After put(): " + countries);

        // 2. get(Object key)
        System.out.println("Country with key 2: " + countries.get(2));

        // 3. remove(Object key)
        countries.remove(4);
        System.out.println("After remove(): " + countries);

        // 4. containsKey(Object key)
        System.out.println("Contains key 1? "
                           + countries.containsKey(1));

        // 5. containsValue(Object value)
        System.out.println("Contains value Japan? "
                           + countries.containsValue("Japan"));

        // 6. keys()
        System.out.println("Keys:");
        Enumeration<Integer> keys = countries.keys();

        while (keys.hasMoreElements()) {
            System.out.println(keys.nextElement());
        }

        // 7. elements()
        System.out.println("Values:");
        Enumeration<String> values = countries.elements();

        while (values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }

        // 8. size()
        System.out.println("Size of Hashtable: " + countries.size());

        // 9. isEmpty()
        System.out.println("Is Hashtable empty? " + countries.isEmpty());
    }
}