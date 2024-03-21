package Class24;

import java.util.HashMap;
import java.util.Map;

public class E8MAps {
    public static void main(String[] args) {
        Map<String, Integer> fruit = new HashMap<>(); //this one is better to use
        fruit.put("Apple", 20);
        fruit.put("Banana", 15);
        fruit.put("Kiwi", 5);
        fruit.put("Orange", 20);
        fruit.entrySet().removeIf(e -> e.getKey().contains("i"));
        System.out.println(fruit);
        fruit.entrySet().removeIf(e->e.getValue()==15||e.getKey().contains("O"));
        System.out.println(fruit);
      /*  fruit.entrySet().removeIf(e->{
        if(e.getValue()==5||e.getKey().toLowerCase().contains("O")){
            return  true;
        }else{
            return false;
        }
    });*/
        System.out.println(fruit);

}
}
