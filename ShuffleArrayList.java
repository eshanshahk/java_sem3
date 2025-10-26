
import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Original List: " + list);

        // Shuffling the elements
        Collections.shuffle(list);

        System.out.println("Shuffled List: " + list);
    }
}
