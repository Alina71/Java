package Review6;

public class Person {
    String name;
    int age;
    double weight;
    double height;
    void eat(){
        System.out.println("Eating...");
    }
    String getName(){
        return name;

    }

    public static void main(String[] args) {
        Person p=new Person();
        p.name="Maria";
        p.age=12;
        p.height=5.4;
        p.weight=120;
        System.out.println(p.name);
        p.eat();
        String name=p.getName();
    }
}
