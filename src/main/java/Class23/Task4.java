package Class23;

import java.util.HashSet;

public class Task4 {
    public static void main(String[] args) {
        HashSet<Student>students=new HashSet<>();
        students.add(new Student("Engin","123"));
        students.add(new Student("Kat","456"));
        students.add(new Student("Massimo","789"));

        for(Student s:students){
            s.printInfo();
        }
    }
}
