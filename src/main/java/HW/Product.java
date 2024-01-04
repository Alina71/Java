package HW;
/*
Online Shopping Cart:

Construct a class Product with attributes like product_name, price, and quantity.
Create a subclass DiscountedProduct that extends Product and includes an additional discount_rate attribute.
Override a method in DiscountedProduct to calculate the price after applying the discount.
Create instances of both classes and show how prices are calculated
 */
public class Product {
    private String productName;
    private double productPrice;
    private int productQuantity;
    public void printInfo() {
        System.out.println(productName + " " + productPrice + " " + productQuantity);
    }
    public Product(String productName, double productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;


    }
        public void calculatePrice (double productPrice,int productQuantity){
            double totalPrice =( productPrice * productQuantity);
            System.out.println("The price for " + productQuantity + " pounds of beef is " + totalPrice);

        }

    }

    class DiscountedProduct extends Product {

        @Override
        public void calculatePrice(double productPrice, int productQuantity) {
            double totalPrice = (productPrice * productQuantity);
            System.out.println("The price for " + productQuantity + " pounds of beef is " + totalPrice);
        }

        private double discount;

        DiscountedProduct(String productName, double productPrice, int productQuantity, double discount) {
            super(productName, productPrice, productQuantity);
            this.discount = discount;
        }
            public void DiscountPrice ( double productPrice, int productQuantity,double discount){
                double totalPriceDiscount =(productPrice * productQuantity)-(productPrice*productQuantity*(discount/100));

                System.out.println("The price for " + productQuantity + " pounds of beef is " + totalPriceDiscount);
            }
        }
