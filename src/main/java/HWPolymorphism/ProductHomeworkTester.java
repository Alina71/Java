package HWPolymorphism;

public class ProductHomeworkTester {
    public static void main(String[] args) {
        ProductHomework[] arr={new Electronics("Samsung TV",989.99,56897),
        new Clothing("Coat",109.99,8974),
        new Furniture("Couch",699.99,32165),
        new Books("Tema pentru acasa",19.99,6325)};
        for(ProductHomework p:arr){
            p.calculateTax();
            if(p instanceof Electronics){
                Electronics e=(Electronics) p;
                ((Electronics) p).applyWarranty(45.99,3);

            }
        }
    }
}
