package Class22;

import java.util.ArrayList;

public class ArrayListWords2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("iepure");
        words.add("licurici");
        words.add("sare");
        words.add("tare");
        words.removeIf(x->x.endsWith("e"));
        System.out.println(words);
    }
}
