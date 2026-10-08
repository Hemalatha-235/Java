import java.util.TreeMap;
import java.util.SortedMap;

public class SortedMapInterfaceDemo {
    public static void main(String[] args) {

        SortedMap<Integer, String> map = new TreeMap<>();

        map.put(103, "Rahul");
        map.put(101, "Ravi");
        map.put(105, "Arun");
        map.put(102, "Sita");
        map.put(104, "Priya");

        System.out.println("Sorted Map: " + map);

        // firstKey()
        System.out.println("First key: " + map.firstKey());

        // lastKey()
        System.out.println("Last key: " + map.lastKey());

        // headMap()
        System.out.println("Head Map (< 103): " + map.headMap(103));

        // tailMap()
        System.out.println("Tail Map (>= 103): " + map.tailMap(103));

        // subMap()
        System.out.println("Sub Map (102 to 105): " + map.subMap(102, 105));

        // comparator()
        System.out.println("Comparator: " + map.comparator());
    }
}