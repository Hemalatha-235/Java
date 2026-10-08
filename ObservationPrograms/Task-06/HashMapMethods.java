import java.util.HashMap;

public class HashMapMethods {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        // 1. put(K key, V value)
        students.put(101, "Rahul");
        students.put(102, "Priya");
        students.put(103, "Arjun");

        System.out.println("After put(): " + students);

        // 2. get(Object key)
        System.out.println("Student with ID 102: " + students.get(102));

        // 3. remove(Object key)
        students.remove(103);
        System.out.println("After remove(): " + students);

        // 4. containsKey(Object key)
        System.out.println("Contains key 101? " + students.containsKey(101));

        // 5. containsValue(Object value)
        System.out.println("Contains value Priya? "
                           + students.containsValue("Priya"));

        // 6. keySet()
        System.out.println("Keys: " + students.keySet());

        // 7. values()
        System.out.println("Values: " + students.values());

        // 8. entrySet()
        System.out.println("Entries: " + students.entrySet());

        // 9. size()
        System.out.println("Size of HashMap: " + students.size());

        // 10. isEmpty()
        System.out.println("Is HashMap empty? " + students.isEmpty());

        // 11. getOrDefault(Object key, V defaultValue)
        System.out.println("Student with ID 101: "
                           + students.getOrDefault(101, "Not Found"));

        System.out.println("Student with ID 105: "
                           + students.getOrDefault(105, "Not Found"));

        // 12. clear()
        students.clear();
        System.out.println("After clear(): " + students);

        System.out.println("Is HashMap empty now? " + students.isEmpty());
    }
}