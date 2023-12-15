import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InventoryManagementSystem ims = new InventoryManagementSystem();

        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Display All Products");
            System.out.println("3. Update Product");
            System.out.println("4. Remove Product");
            System.out.println("5. Check Stock");
            System.out.println("6. Record Sale");
            System.out.println("7. Generate Report");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String productName = scanner.next();
                    System.out.print("Enter price: $");
                    double price = scanner.nextDouble();
                    System.out.print("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    Product newProduct = new Product(productName, price, quantity);
                    ims.addProduct(newProduct);
                    break;

                case 2:
                    ims.displayAllProducts();
                    break;

                case 3:
                    System.out.print("Enter the product ID to update: ");
                    int updateProductId = scanner.nextInt();
                    System.out.print("Enter new product name: ");
                    String newName = scanner.next();
                    System.out.print("Enter new price: $");
                    double newPrice = scanner.nextDouble();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    ims.updateProduct(updateProductId, newName, newPrice, newQuantity);
                    break;

                case 4:
                    System.out.print("Enter the product ID to remove: ");
                    int removeProductId = scanner.nextInt();
                    ims.removeProduct(removeProductId);
                    break;

                case 5:
                    ims.checkStock();
                    break;

                case 6:
                    System.out.print("Enter the product ID for the sale: ");
                    int saleProductId = scanner.nextInt();
                    System.out.print("Enter the quantity sold: ");
                    int quantitySold = scanner.nextInt();
                    ims.recordSale(saleProductId, quantitySold);
                    break;

                case 7:
                    ims.generateReport();
                    break;

                case 8:
                    System.out.println("Exiting the Inventory Management System. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
