package Class10;

public class PersonTester {
    public static void main(String[] args) {
        Person p1=new Person();
        p1.FirstName="Maria";
        p1.LastName="Tanasa";
        p1.age=21;
        p1.weight=120;
        System.out.println(p1.FirstName);
        System.out.println(p1.LastName);
        System.out.println(p1.age);
        System.out.println(p1.weight);
        p1.voice();
        p1.smile();
        p1.sleep();

    }
}
