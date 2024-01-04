package Class22;

import java.util.ArrayList;
/*
Create an arrayList of drinks call it. If any drink has letter “a” or “e” replace the whole word with water.
Create an arrayList of words. Remove every word that ends with “e”.
 */

public class ArrayListDrink {
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Pina colada");
        drinks.add("Juice");
        drinks.add("Wine");
        drinks.add("Milk");
        for (int i = 0; i < drinks.size(); i++) {
            String s = drinks.get(i);
            if (s.contains("a") || s.contains("e")) {
                drinks.set(i, "water");
            }

        }
        System.out.println(drinks);
    }
}


