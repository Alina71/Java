package Class19;
/*
Create a Class Computer that will have 4 subclasses as Apple,
Lenovo, HP, Dell.
Define common behavior within and some fields in parent class
and override
some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array.
Loop through each object and execute available methods.
 */
public class Computer {
    private String name;
    private int price;
    private int memory;

    public Computer(String name, int price, int memory) {
        this.name = name;
        this.price = price;
        this.memory = memory;
    }
    public void printInfo(){
        System.out.println(name+" "+price+" "+memory);
    }
    public void browseInternet(){
        System.out.println("Open the link");
    }
    public void playVideo(){
        System.out.println("Open the video");
    }
}
class Apple extends Computer{
    public Apple(String name, int price, int memory) {
        super(name, price, memory);
    }
    public void playVideo(){
        System.out.println("Open the video on Apple computer");
    }
}
class Lenovo extends Computer{
    public Lenovo(String name, int price, int memory) {
        super(name, price, memory);
    }
    public void browseInternet(){
        System.out.println("Open the link on Lenovo");
    }
}
class HP extends Computer{
    public HP(String name, int price, int memory) {
        super(name, price, memory);
    }
    public void browseInternet(){
        System.out.println("Open the link on HP");
    }
}
class Dell extends Computer{
    public Dell(String name, int price, int memory) {
        super(name, price, memory);
    }
    public void playVideo(){
        System.out.println("Open the video on Dell computer");
    }
}