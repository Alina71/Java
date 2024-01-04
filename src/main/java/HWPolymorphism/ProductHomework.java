package HWPolymorphism;


/*
E-Commerce System Task: Build a Product class with subclasses like
Electronics, Clothing, Furniture, and Books.
Define attributes like price, name, and SKU in the Product class.
Override methods such as calculateTax based on product category.
Introduce unique methods like applyWarranty in Electronics.
Create objects of each subclass, store them in an array, and loop
 through to display or calculate prices and taxes.
 */

public class ProductHomework {
    private String name;
    private double price;
    private int SKU;

    public ProductHomework(String name, double price, int SKU) {
        this.name = name;
        this.price = price;
        this.SKU = SKU;
    }

public  double getPrice(){
        return price;
}
public void calculateTax() {
        double priceTotal = this.price+(this.price * 0.12);
        System.out.println("The price is "+this.price);
        System.out.println("The price after taxes is " + priceTotal);
    }

}
class Electronics extends ProductHomework {

    Electronics(String name, double price, int SKU) {
        super(name, price, SKU);
    }


    @Override
    public void calculateTax() {
        double price = getPrice();
        double priceTotal = price+(price * 0.2);
        System.out.println("The price is "+price);
        System.out.println("The price after taxes is " + priceTotal);
    }

    public void applyWarranty(double amount, int year) {

        double totalPrice = amount * year;
        System.out.println("The price of warranty is " + totalPrice);
        System.out.println("**********************");
    }
}

class Clothing extends ProductHomework {
    Clothing(String name, double price, int SKU) {
        super(name, price, SKU);

    }

    @Override
    public void calculateTax() {
        double price = getPrice();
        double priceTotal = price+(price * 0.08);
        System.out.println("The price is "+price);
        System.out.println("The price after taxes is " + priceTotal);
        System.out.println("**********************");
    }
}

class Furniture extends ProductHomework {
    Furniture(String name, double price, int SKU) {
        super(name, price, SKU);
    }

    @Override
    public void calculateTax() {
        double price = getPrice();
        double priceTotal= price+(price * 0.16);
        System.out.println("The price is "+price);
        System.out.println("The price after taxes is " + priceTotal);
        System.out.println("**********************");
    }
}

class
Books extends ProductHomework {
    Books(String name, double price, int SKU) {
        super(name, price, SKU);
    }
    @Override
    public void calculateTax() {
        double price = getPrice();
        double priceTotal = price+(price * 0.04);
        System.out.println("The price is "+price);
        System.out.println("The price after taxes is " + priceTotal);
    }
}

