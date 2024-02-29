
package quanLySanPham;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManager productManager = new ProductManager();

        Category category1 = new Category("Điện thoại");
        Category category2 = new Category("Thiết bị ");
        Category category3 = new Category("Điện tử");

        productManager.createProduct(1L, "iPhone", 200000.0, 10, category1);
        productManager.createProduct(2L, "Laptop", 700000.0, 5, category2);
        productManager.createProduct(3L, "Tivi", 1500000.0, 20, category3);
        productManager.createProduct(4L, "Máy giặt", 500000.0, 20, category3);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Create Product");
            System.out.println("2. Edit Product");
            System.out.println("3. Delete Product");
            System.out.println("4. Display Product by Id");
            System.out.println("5. Display All Products");
            System.out.println("6. Display Products by Category");
            System.out.println("7. Calculate Total Price of Products");
            System.out.println("8. Display Products with Price > 100000");
            System.out.println("9. Display Electronics Products with Price > 200000");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Create Product
                    System.out.print("product id: ");
                    Long id = scanner.nextLong();
                    System.out.print("product name: ");
                    String name = scanner.next();
                    System.out.print("product price: ");
                    Double price = scanner.nextDouble();
                    System.out.print("product quantity: ");
                    Integer quantity = scanner.nextInt();
                    System.out.print("product category name: ");
                    String categoryName = scanner.next();
                    Category category = new Category(categoryName);
                    productManager.createProduct(id, name, price, quantity, category);
                    break;
                case 2:
                    // Edit Product
                    System.out.print("product id to edit: ");
                    Long editId = scanner.nextLong();
                    System.out.print("new product name: ");
                    String newName = scanner.next();
                    System.out.print("new product price: ");
                    Double newPrice = scanner.nextDouble();
                    System.out.print("new product quantity: ");
                    Integer newQuantity = scanner.nextInt();
                    System.out.print("new product category name: ");
                    String newCategoryName = scanner.next();
                    Category newCategory = new Category(newCategoryName);
                    productManager.updateProduct(editId, newName, newPrice, newQuantity, newCategory);
                    break;
                case 3:
                    // Delete Product
                    System.out.print("product id to delete: ");
                    Long deleteId = scanner.nextLong();
                    productManager.deleteProduct(deleteId);
                    break;
                case 4:
                    // Display Product by Id
                    System.out.print("product id to display: ");
                    Long displayId = scanner.nextLong();
                    productManager.displayProductByID(displayId);
                    break;
                case 5:
                    // Display All Products
                    productManager.displayAllProducts();
                    break;
                case 6:
                    // Display Products by Category
                    System.out.print("category name to display products: ");
                    String categoryNameToDisplay = scanner.next();
                    Category categoryToDisplay = new Category(categoryNameToDisplay);
                    productManager.displayProductsByCategory(categoryToDisplay);
                    break;
                case 7:
                    // Calculate Total Price of Products
                    System.out.println("Total price of all products: " + productManager.calculateTotalPrice());
                    break;
                case 8:
                    // Display Products with Price > 100000
                    productManager.displayProductsPriceGreaterThan(100000);
                    break;
                case 9:
                    // Display Electronics Products with Price > 200000
                    productManager.displayElectronicsProductsPriceGreaterThan(200000);
                    break;
                case 0:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        } while (choice != 0);
        scanner.close();
    }
}