import java.util.TreeMap;
import java.util.NavigableMap;

public class NavigableMapInterfaceDemo {
    public static void main(String[] args) {

        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(101, "Ravi");
        map.put(102, "Sita");
        map.put(103, "Rahul");
        map.put(104, "Priya");
        map.put(105, "Arun");

        System.out.println("Navigable Map: " + map);

        // lowerKey()
        System.out.println("Lower key than 103: " + map.lowerKey(103));

        // floorKey()
        System.out.println("Floor key of 103: " + map.floorKey(103));

        // ceilingKey()
        System.out.println("Ceiling key of 103: " + map.ceilingKey(103));

        // higherKey()
        System.out.println("Higher key than 103: " + map.higherKey(103));

        // firstEntry()
        System.out.println("First entry: " + map.firstEntry());

        // lastEntry()
        System.out.println("Last entry: " + map.lastEntry());

        // pollFirstEntry()
        System.out.println("Removed first entry: " + map.pollFirstEntry());
        System.out.println("Map after pollFirstEntry: " + map);

        // pollLastEntry()
        System.out.println("Removed last entry: " + map.pollLastEntry());
        System.out.println("Map after pollLastEntry: " + map);

        // descendingMap()
        System.out.println("Descending Map: " + map.descendingMap());
    }
}