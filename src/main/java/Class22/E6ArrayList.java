package Class22;

import java.util.ArrayList;
/*
if a name contains the letter o replace it with java
 */

public class E6ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Liza");
        names.add("Tonia");
        names.add("Lilia");
        names.add("Rita");
        for(int i=0;i<names.size();i++){
            String s=names.get(i);
          if(s.contains("o")){
              //replace the elements
              names.set(i,"Java");
          }
        }
        System.out.println(names);
    }
}
