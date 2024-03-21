package Class23;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class E5Sets {
    public static void main(String[] args) {
        HashSet<String> fruit=new LinkedHashSet<>();
        fruit.add("Mango");
        fruit.add("Kiwi");
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Apple");
        System.out.println(fruit);

    }
}
