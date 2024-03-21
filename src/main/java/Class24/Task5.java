package Class24;

import java.util.LinkedHashMap;
import java.util.Map;
/*
Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest
 salary. Output should be in the below format
John Smith=$100000
 */

public class Task5 {
    public static void main(String[] args) {
        Map<String,Integer> employee = new LinkedHashMap<>();
        employee.put("Maria",56000);
        employee.put("Tania",23560);
        employee.put("Alexa",5632);
        employee.put("Gina",6589);

        String empName=" ";
        int salary=0;

        for(var e:employee.entrySet()){
            if(e.getValue()>salary){
                empName=e.getKey();
                salary=e.getValue();

            }
        }
        System.out.println(empName+" =$"+salary);
    }
}
