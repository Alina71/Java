package Class22;

public class Product {
    private final String productID;
    private String productName;
    private double price;
    private int stockQuantity;

    public Product(String productID, String productName, double price, int stockQuantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public void restock(int amount) {
        this.stockQuantity = stockQuantity + amount;
    }

    public int   sell(int amount) {
        if (stockQuantity >= amount) {
            stockQuantity = stockQuantity - amount;

            double totalSalePrice;
            totalSalePrice = amount * price;
            System.out.println("The total amount for " + amount + " "+productName+" is " + totalSalePrice);

        }
        return amount;
    }
        public void printInfo () {
            System.out.println("Product name is " + productName + " with product id " + productID + " has the price of " + price + " and stock quantity " + stockQuantity);
        }
    }



