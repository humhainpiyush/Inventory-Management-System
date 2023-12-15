// Product.java
public class Product {
    private static int nextProductId = 1;

    private int productId;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity) {
        this.productId = nextProductId++;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity in Stock: " + quantity);
    }

    public void updateProduct(String newName, double newPrice, int newQuantity) {
        this.productName = newName;
        this.price = newPrice;
        this.quantity = newQuantity;
        System.out.println("Product updated successfully!");
    }
}
