package HW;

public class CarTester {
    public static void main(String[] args) {

        LuxuryCar LC= new LuxuryCar("Mercedes","GLE 350 Bluetec",2020,49.99);
        LC.calculateRentalPrice(7);
        LC.PriceIns(7);
      EconomyCar EC=new EconomyCar("Kia","Carnival",2020);
      EC.calculateRentalPrice(7);
    }
}
