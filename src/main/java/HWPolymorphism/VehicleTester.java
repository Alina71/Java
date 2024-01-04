package HWPolymorphism;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle[] arr = {new Car(80, "Black", "Gas"),
                new Truck(60, "Yellow", "Diesel"),
                new Motorcycle(75, "Black", "Gas"),
                new Bicycle(10, "White", "None")};
        for (Vehicle v : arr) {
            v.printInfo();
            v.accelerate();
            v.brake();
            if (v instanceof Truck) {
                Truck t = (Truck) v;
                t.loadTruck();

            }
        }
    }
}
