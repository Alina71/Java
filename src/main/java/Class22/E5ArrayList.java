package Class22;

import java.util.ArrayList;
/*
print yes if a name contains
 the letter o otherwise no for all names
 */
public class E5ArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Liza");
        names.add("Tina");
        names.add("Lilia");
        names.add("Rita");

            System.out.println("NO");
            System.out.println(names);
            System.out.println(names.size());
            System.out.println(names.contains("o"));
        System.out.println("**************");
        for (String s : names) {
            if(s.contains("o")){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}
