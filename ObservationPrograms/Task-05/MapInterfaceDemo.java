import java.util.HashMap;
import java.util.Map;

public class MapInterfaceDemo {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        // put()
        map.put(101, "Ravi");
        map.put(102, "Sita");
        map.put(103, "Rahul");
        System.out.println("Map: " + map);

        // get()
        System.out.println("Value for key 101: " + map.get(101));

        // remove()
        map.remove(102);
        System.out.println("After removing key 102: " + map);

        // containsKey()
        System.out.println("Contains key 103: " + map.containsKey(103));

        // containsValue()
        System.out.println("Contains value Ravi: " + map.containsValue("Ravi"));

        // keySet()
        System.out.println("Keys: " + map.keySet());

        // values()
        System.out.println("Values: " + map.values());

        // entrySet()
        System.out.println("Entries: " + map.entrySet());

        // size()
        System.out.println("Size: " + map.size());

        // isEmpty()
        System.out.println("Is map empty: " + map.isEmpty());

        // clear()
        map.clear();
        System.out.println("After clear: " + map);

        System.out.println("Is map empty: " + map.isEmpty());
    }
}