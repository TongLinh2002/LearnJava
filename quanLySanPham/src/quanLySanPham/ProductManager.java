package quanLySanPham;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
	 private List<Product> products;

	    public ProductManager() {
	        this.products = new ArrayList<>();
	    }

	    // add product
	    public void createProduct(Long id, String name, Double price, Integer quantity, Category category) {
	        Product newProduct = new Product(id, name, price, quantity, category);
	        products.add(newProduct);
	        System.out.println("product create successfully!");
	    }

	    // edit information Product by id
	    public void updateProduct(Long id, String newName, Double newPrice, Integer newQuantity, Category newCategory) {
	        for (Product product : products) {
	            if (product.getId().equals(id)) {
	                product.setName(newName);
	                product.setPrice(newPrice);
	                product.setQuantity(newQuantity);
	                product.setCategory(newCategory);
	                System.out.println("product update successfully! ");

	            }
	        }
	        System.out.println("product not found!");
	    }
          // delete Product
	    public void deleteProduct(Long id) {
	        for (Product product : products) {
	            if (product.id.equals(id)) {
	                products.remove(product);
	                System.out.println("Product deleted successfully.");
	                
	            } 
	            
	        }
	       System.out.println("Product not found.");
	    
	    }
	    
	    // Display product by ID
	    public void displayProductByID(Long id) {
	    for (Product product : products) {
            if (product.id.equals(id)) {
                System.out.println("Product: " + product.name + ", Price: " + product.price + ", Quantity: " + product.quantity + ", Category: " + product.category.name);
               
            }
        }
        System.out.println("Product not found!");
    }
	    
	    
	    // Display all Product
	    public void displayAllProducts() {
	        for (Product product : products) {
	            System.out.println("Product: " + product.name + ", Price: " + product.price + ", Quantity: " + product.quantity + ", Category: " + product.category.name);
	        }
	    }
	    public void displayProductsByCategory(Category category) {
	        for (Product product : products) {
	            if (product.category.name.equals(category.name)) {
	                System.out.println("Product: " + product.name + ", Price: " + product.price + ", Quantity: " + product.quantity);
	            }
	        }
	    }

	    public double calculateTotalPrice() {
	        double totalPrice = 0;
	        for (Product product : products) {
	            totalPrice += product.price * product.quantity;
	        }
	        return totalPrice;
	    }

	    public void displayProductsPriceGreaterThan(double amount) {
	        for (Product product : products) {
	            if (product.price > amount) {
	                System.out.println("Product: " + product.name + ", Price: " + product.price);
	            }
	        }
	    }

	    public void displayElectronicsProductsPriceGreaterThan(double amount) {
	        for (Product product : products) {
	            if (product.price > amount && product.category.name.equals("Điện tử")) {
	                System.out.println("Product: " + product.name + ", Price: " + product.price);
	            }
	        }
	    }
}
