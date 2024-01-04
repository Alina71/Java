package Class21;
/*
Vehicle Management System: Design a base class Vehicle with methods like startEngine(),
stopEngine(), fuelUp(), and fields like make, model, and fuelLevel. Create subclasses
like Car, Truck, and Motorcycle, each with specific
implementations for the methods, considering their unique characteristics.
 */
public  abstract class Vehicle {
    private String make;
    private String model;
    private int fuelLevel;
    public Vehicle(String make,String model,int fuelLevel){
        this.make=make;
        this.model=model;
        this.fuelLevel=fuelLevel;
    }
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract void fuelUp();
    public void printInfo(){
        System.out.println("The vehicle "+make+" model "+model+" has "+fuelLevel+" fuel level.");
    }
}
class Car extends Vehicle {
    public Car(String make, String model, int fuelLevel) {
        super(make, model, fuelLevel);
    }
    @Override
    public void startEngine() {
        System.out.println("Press the start/stop button to start the engine.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Press the start/stop button to stop the engine.");
    }

    @Override
    public void fuelUp() {
        System.out.println("Warning, you have 25 miles to go, fuel up the tank.");
    }
}
class Truck extends Vehicle{
    public Truck(String make, String model, int fuelLevel){
        super(make, model, fuelLevel);
    }

    @Override
    public void startEngine() {
        System.out.println("Put the key in the ignition to start the truck.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Take off the key.");
    }

    @Override
    public void fuelUp() {
        System.out.println("The tank has one quarter left.");

    }
}
class Motorcycle extends Vehicle{
    public Motorcycle(String make, String model, int fuelLevel){
        super(make, model, fuelLevel);
    }

    @Override
    public void startEngine() {
        System.out.println("Turn on the key.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Turn off the key.");
    }

    @Override
    public void fuelUp() {
        System.out.println("Warning, fuel up the thank");
    }
}