package HW;
/*
  Create a class named Vehicle. If no arguments are passed while
  creating an object of the class, it should print "I love vehicles".
  If a String representing the type of vehicle (like "Car", "Bike") is passed,
  it should print "I love [VehicleType]".
   For example, if "Car" is passed, it should print "I love Car"
   */
public class Vehicle {
Vehicle(){
    System.out.println("I love vehicles");
}
Vehicle (String typeOfTheVehicle){
    System.out.println("I love "+typeOfTheVehicle);
}

    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        new Vehicle("Toyota");
    }
}
