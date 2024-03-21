package Class24;
/*
Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.

In Test Class create a Map that will store key in ascending order. In that map store personId and a Person Object. Print each object details.
Example of key is 1 , 2 ,3 etc.
 */

import java.util.Map;
import java.util.TreeMap;

public class Task4 {
    public static void main(String[] args) {
        Map<Integer,Person> person = new TreeMap<>();
        person.put(1,new Person("Maria","Tanasa",21,2563.45));
        person.put(2,new Person("Stefan","Tanasa",20,2568.45));
        person.put(3,new Person("Vasile","Tanasa",35,8956));
        person.put(4,new Person("Alina","Merlan",36,1235));
        person.forEach((k,v)->{
            System.out.println("ID "+k);
            v.printInfo();
       });
    }
}
