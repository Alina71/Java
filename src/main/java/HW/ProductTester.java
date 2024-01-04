package HW;

public class ProductTester {
    public static void main(String[] args) {
        Product p=new Product("Beef",12.99,2);
        p.calculatePrice(12.99,2);
        DiscountedProduct dp=new DiscountedProduct("Beef",12.99,2,25);
        dp.DiscountPrice(12.99,2,25);
    }
}
