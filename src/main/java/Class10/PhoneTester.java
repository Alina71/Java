package Class10;
//Create a Class “Phone”. Create 3
// Objects of it: iPhone, Pixel, Samsung
// create 3 to 5 attributes
//And three behaviours
public class PhoneTester {
    public static void main(String[] args) {
        Phone Samsung = new Phone();
        Samsung.make = "Galaxy";
        Samsung.model = "S22";
        Samsung.price = 1200;
        Samsung.color = "Black";
        System.out.println(Samsung.make);
        System.out.println(Samsung.model);
        System.out.println(Samsung.price);
        System.out.println(Samsung.color);
Samsung.pictures();
Samsung.call();
Samsung.text();


    }
}

