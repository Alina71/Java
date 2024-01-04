package HWPolymorphism;

public class Vehicle {
/*
 Vehicle Hierarchy Task: Create a class Vehicle with subclasses like Car,
 Truck, Motorcycle, and Bicycle.
Define common attributes like speed, color, and fuelType in the Vehicle class.
Override methods in the subclasses, like accelerate and brake, with specific behaviors.
Add unique methods in subclasses, like loadCargo in Truck.
Instantiate objects of each subclass and store them in an array.
 Iterate through the array to demonstrate polymorphism.
 */

    private int speed;
    private String color;
    private String fuelType;

    public Vehicle(int speed, String color, String fuelType) {
        this.speed = speed;
        this.color = color;
        this.fuelType = fuelType;
    }

    public void printInfo() {
        System.out.println(speed + " " + color + " " + fuelType);
    }

    public void accelerate() {
        System.out.println(" Vehicle speed goes up.");
    }

    public void brake() {
        System.out.println("Vehicle stops.");
    }
}
    class Car extends Vehicle {
        Car(int speed, String color, String fuelType) {

            super(speed, color, fuelType);
        }

        @Override
        public void printInfo() {
          super.printInfo();
        }

        @Override
        public void accelerate() {
            System.out.println("Car speed goes up.");
        }

        @Override
        public void brake() {
            System.out.println("Car stops.");
            System.out.println("*******************");
        }
    }
    class Truck extends Vehicle{
        public Truck(int speed, String color, String fuelType){
            super(speed, color, fuelType);
        }

        @Override
        public void printInfo() {
            super.printInfo();
        }

        @Override
        public void accelerate() {
            System.out.println("Truck needs more time to accelerate because of the weight.");
        }

        @Override
        public void brake() {
            System.out.println("Trucks needs more time to stop.");
        }
        public void loadTruck(){
            System.out.println("This truck can be loaded up to 40000 lbs.");
            System.out.println("*******************");
        }
    }
    class Motorcycle extends Vehicle{
        public Motorcycle(int speed, String color, String fuelType){
            super(speed,color,fuelType);

        }

        @Override
        public void printInfo() {
            super.printInfo();
        }

        @Override
        public void accelerate() {
            System.out.println("Motorcycle accelerate very fast.");
        }

        @Override
        public void brake() {
            System.out.println("To avoid an accident slow brake. ");
            System.out.println("*******************");
        }
    }
    class Bicycle extends Vehicle{
        Bicycle(int speed, String color, String fuelType){
            super(speed,color,fuelType);
        }

        @Override
        public void printInfo() {
            super.printInfo();
        }

        @Override
        public void accelerate() {
            System.out.println("A faster pedaling is a faster accelerating");
        }

        @Override
        public void brake() {
            System.out.println("To avoid an accident slow brake.");
        }
    }



