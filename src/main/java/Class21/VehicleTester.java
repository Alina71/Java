package Class21;

public class VehicleTester {
    public static void main(String[] args) {
        Vehicle[] v={
                new Car("Toyota","Highlander",15),
                new Truck("Volvo","FM",200),
                new Motorcycle("Kawasaki","Ninja",7)
        };
        for( Vehicle vehicle:v){
            vehicle.printInfo();
            vehicle.startEngine();
            vehicle.stopEngine();
            vehicle.fuelUp();
            System.out.println("*************************");
        }
    }
}
