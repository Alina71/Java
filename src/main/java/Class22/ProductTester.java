package Class22;

public class ProductTester {
    public static void main(String[] args) {
        Product p=new Product("1234GL","Bicycle",563.99,89);
        p.setProductName("Tricycle");
        p.setPrice(199.99);
        p.setStockQuantity(9);
        p.restock(78);
        p.sell(25);
        p.printInfo();
    }
}
