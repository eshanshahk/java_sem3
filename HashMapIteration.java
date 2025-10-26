
import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements to HashMap
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Mango");

        System.out.println("Iterating using entrySet():");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\nIterating using keySet():");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        System.out.println("\nIterating using values():");
        for (String value : map.values()) {
            System.out.println("Value: " + value);
        }
    }
}
