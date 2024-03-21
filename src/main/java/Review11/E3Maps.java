package Review11;

import java.util.LinkedHashMap;

public class E3Maps {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> studentsMap=new LinkedHashMap<>();
        studentsMap.put("John",95);
        studentsMap.put("Adam",88);
        studentsMap.put("Muh",92);
        studentsMap.put("Kat",91);
        studentsMap.put("Kari",90);

        studentsMap.entrySet().removeIf(x->x.getValue()<90||x.getKey().contains("a"));
        System.out.println(studentsMap);
    }
}
