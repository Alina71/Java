package Class22;

import java.util.ArrayList;

public class ArrayListWords {
    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList<>();
        words.add("iepure");
        words.add("licurici");
        words.add("sare");
        words.add("tare");
        for(int i=0;i< words.size();i++){
            if(words.get(i).endsWith("e")){
                words.remove(i);
                i--;

            }

        }
        System.out.println(words);
    }
}
