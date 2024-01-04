package Class22;

public class EmployeeTester {
    public static void main(String[] args) {
        Person p=new SyntaxEmployee();
        Human h=new SyntaxEmployee();
        Employee e=new SyntaxEmployee();
        p.talk();
        h.walk();
        e.work();
        e.talk();
        e.walk();
    }
}
