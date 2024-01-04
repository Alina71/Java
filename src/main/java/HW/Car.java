package HW;
/*
Create a class Car with properties like make,
model, and year.
Implement a method calculate_rental_price
based on the number of rental days.
Create two subclasses: LuxuryCar and EconomyCar.
Override the calculate_rental_price method in
LuxuryCar to include additional charges.
Demonstrate the functionality by creating
 instances of each class and calling their methods
 */
public class Car {
    private String make;
    private String model;
    private int year;
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void calculateRentalPrice(int days) {
        double totalPrice = days * 112.99;
        System.out.println("Car price for " + days + " is " + totalPrice);
    }
}
class LuxuryCar extends Car {
    @Override
    public void calculateRentalPrice(int days) {
        double totalPrice = days * 299.99;
        System.out.println("Luxury car price for " + days + " is " + totalPrice);
    }
private double insurance;
    LuxuryCar(String make, String model, int year,double insurance) {
        super(make, model, year);
        this.insurance = insurance;
    }
        void PriceIns(int days){
            double totalPriceIns=days*49.99;
        System.out.println("For Luxury car insurance cost for "+days+" days is "+totalPriceIns);
    }
    }

    class EconomyCar extends Car {
    @Override
        public void calculateRentalPrice(int days) {
            double totalPrice = days * 43.99;
            System.out.println("Economy car price for " + days + " is " + totalPrice);
        }

        EconomyCar(String make, String model, int year) {
            super(make, model, year);
        }
    }




