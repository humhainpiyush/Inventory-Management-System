import java.util.ArrayList;
import java.util.List;

public class InventoryManagementSystem {
    private List<Product> products;

    public InventoryManagementSystem() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
        System.out.println("Product added successfully!");
    }

    public void displayAllProducts() {
        if (products.isEmpty()) {
            System.out.println("No products found.");
        } else {
            for (Product product : products) {
                product.displayProduct();
                System.out.println("--------------------");
            }
        }
    }

    public void updateProduct(int productId, String newName, double newPrice, int newQuantity) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                product.updateProduct(newName, newPrice, newQuantity);
                return;
            }
        }
        System.out.println("Product not found with ID: " + productId);
    }

    public void removeProduct(int productId) {
        products.removeIf(product -> product.getProductId() == productId);
        System.out.println("Product removed successfully!");
    }

    public void checkStock() {
        for (Product product : products) {
            if (product.getQuantity() <= 5) {
                System.out.println("Low stock for product ID " + product.getProductId() + ": " + product.getProductName());
            }
        }
    }

    public void recordSale(int productId, int quantitySold) {
        for (Product product : products) {
            if (product.getProductId() == productId) {
                if (product.getQuantity() >= quantitySold) {
                    product.setQuantity(product.getQuantity() - quantitySold);
                    System.out.println("Sale recorded successfully!");
                } else {
                    System.out.println("Insufficient stock for the sale.");
                }
                return;
            }
        }
        System.out.println("Product not found with ID: " + productId);
    }

    public void generateReport() {
        if (products.isEmpty()) {
            System.out.println("No products found for the report.");
        } else {
            System.out.println("Product Report:");
            for (Product product : products) {
                System.out.println("--------------------");
                product.displayProduct();
            }
            System.out.println("End of Report.");
        }
    }
}
