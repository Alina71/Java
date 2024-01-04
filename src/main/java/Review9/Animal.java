package Review9;

public abstract class Animal {
    private String name;
    private String color;
    private int age;

    public Animal(String name,String color,int age){
        this.name=name;
        this.color=color;
        this.age=age;

    }
 public   String getName(){
        return name;
    }
 public  abstract void eat();
abstract void speak();
public void printInfo(){
    System.out.println(name+" "+color+" "+age);
}

}
class Dog extends  Animal{
    String breed;
    public Dog(String name, String color, int age,String breed) {
        super(name, color, age);
        this.breed=breed;
    }

    @Override
    public void eat() {
        System.out.println("Dogs like to eat bones and meat.");
    }

    @Override
    void speak() {
        System.out.println("Woof Woof");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println(breed);
    }

    public void run() {
    }
}
class Cat extends Animal{

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void eat() {
        System.out.println("Cats eat fish.");
    }

    @Override
    void speak() {
        System.out.println("Meow meow");
    }
}