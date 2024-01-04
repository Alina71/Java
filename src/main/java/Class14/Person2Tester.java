package Class14;

public class Person2Tester {
    public static void main(String[] args) {


        Person2 p1 = new Person2();

        p1.name = "Zeeshan";
        p1.age = 22;
        p1.weight = 60;
        p1.printInfo();
        System.out.println(Person.noOfEye);
        Person.noOfEye = 3;
        Person p2 = new Person();
        p2.name = "Sino";
        p2.age = 25;
        p2.weight = 70;
        p2.printInfo();
        System.out.println(Person2.noOfEye);

        Person2.printNoOfEyes();
    }
}