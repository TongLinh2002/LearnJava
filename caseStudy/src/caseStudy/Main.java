package caseStudy;

import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PM pms = new PM();

        System.out.println("Welcome to Product Management System!");
        System.out.println("----------+++++---------------");

        boolean loggedIn = false;
        String loggedInUser = "";

        while (true) {
            if (!loggedIn) {
                System.out.println("\n1. Register");
                System.out.println("2. Login");
                System.out.println("3. Exit");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (option) {
                    case 1:
                        System.out.print("Enter username: ");
                        String regUsername = scanner.nextLine();
                        System.out.print("Enter password: ");
                        String regPassword = scanner.nextLine();
                        pms.register(regUsername, regPassword);
                        break;
                    case 2:
                        System.out.print("Enter username: ");
                        String username = scanner.nextLine();
                        System.out.print("Enter password: ");
                        String password = scanner.nextLine();
                        if (pms.login(username, password)) {
                            loggedIn = true;
                            loggedInUser = username;
                        }
                        break;
                    case 3:
                        System.out.println("Exiting...");
                        System.exit(0);
                    default:
                        System.out.println("Invalid option.");
                }
            } else {
                System.out.println("\nLogged in as " + loggedInUser);
                System.out.println("1. Add Product");
                System.out.println("2. Edit Product");
                System.out.println("3. Delete Product");
                System.out.println("4. View All Products");
                System.out.println("5. Logout");
                System.out.print("\nLet choose an option: ");
                int loggedInOption = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (loggedInOption) {
                    case 1:
                        System.out.print("Enter product ID: ");
                        int productId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter product name: ");
                        String productName = scanner.nextLine();
                        System.out.print("Enter product category: ");
                        String productCategory = scanner.nextLine();
                        System.out.print("Enter product price: ");
                        double productPrice = scanner.nextDouble();
                        System.out.print("Enter product quantity: ");
                        int productQuantity = scanner.nextInt();
                        pms.addProduct(new Product(productId, productName, productCategory, productPrice, productQuantity));
                        System.out.println("Product added successfully!");
                        break;
                    case 2:
                        System.out.print("Enter product ID to edit: ");
                        int editProductId = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter new product name: ");
                        String newProductName = scanner.nextLine();
                        System.out.print("Enter new product category: ");
                        String newProductCategory = scanner.nextLine();
                        System.out.print("Enter new product price: ");
                        double newProductPrice = scanner.nextDouble();
                        System.out.print("Enter new product quantity: ");
                        int newProductQuantity = scanner.nextInt();
                        pms.editProduct(editProductId, new Product(editProductId, newProductName, newProductCategory, newProductPrice, newProductQuantity));
                        System.out.println("Product edited successfully!");
                        break;
                    case 3:
                        System.out.print("Enter product ID to delete: ");
                        int deleteProductId = scanner.nextInt();
                        pms.deleteProduct(deleteProductId);
                        System.out.println("Product deleted successfully.");
                        break;
                    case 4:
                        List<Product> allProducts = pms.getAllProducts();
                        if (allProducts.isEmpty()) {
                            System.out.println("No products available.");
                        } else {
                            System.out.println("All Products:");
                            for (Product product : allProducts) {
                                System.out.println("ID: " + product.getId() + ", Name: " + product.getName() + ", Category: " + product.getCategory() + ", Price: " + product.getPrice() + ", Quantity: " + product.getQuantity());
                            }
                        }
                        break;
                    case 5:
                        loggedIn = false; // Logout
                        break;
                    default:
                        System.out.println("Invalid option.");
                }
            }
        }
    }
}
