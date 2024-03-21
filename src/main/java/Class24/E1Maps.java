package Class24;

import java.util.HashMap;
import java.util.Map;

public class E1Maps {
    public static void main(String[] args) {

        Map<String,Integer> fruit=new HashMap<>(); //this one is better to use
        //HashMap<String,Integer>fruit=new HashMap<>();
        //fruit-is the variable
        //apple, banana...-is the key
        fruit.put("Apple",20);
        fruit.put("Banana",15);
        fruit.put("Kiwi",5);
        fruit.put("Orange",20);
        //duplicate keys are not allowed if we try it will replace previous value
        // fruit.put("Kiwi",15);
        System.out.println(fruit);
        System.out.println(fruit.size());
        System.out.println(fruit.containsKey("Apple"));
        System.out.println(fruit.containsKey("Apple".toLowerCase()));
        System.out.println(fruit.containsKey("Legs"));
        System.out.println(fruit.containsValue(25));
        System.out.println(fruit.containsValue(5));
        System.out.println(fruit.isEmpty());
        System.out.println(fruit.get("Kiwi"));
    }
}
