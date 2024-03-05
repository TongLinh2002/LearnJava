
package caseStudy;

import java.util.List;
import java.util.ArrayList;

//PM: ProductManagementSystem
class PM {
	private List<Product> products;
	private List<User> users;
	private User currentUser;

	public PM() {
		this.products = new ArrayList<>();
		this.users = new ArrayList<>();
		// Add some initial users
		users.add(new User("admin", "admin123"));
	}

	public boolean register(String username, String password) {
		for (User user : users) {
			if (user.getUsername().equals(username)) {
				System.out.println("Username already exists.");
				return false;
			}
		}
		users.add(new User(username, password));
		System.out.println("Registration successful.");
		return true;
	}

	public boolean login(String username, String password) {
		for (User user : users) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				currentUser = user;
				System.out.println("Login successful.");
				return true;
			}
		}
		System.out.println("Invalid username or password.");
		return false;
	}

	public void addProduct(Product product) {
		products.add(product);
	}

	public void editProduct(int id, Product updatedProduct) {
		for (Product product : products) {
			if (product.getId() == id) {
				// Update product details
				product.setName(updatedProduct.getName());
				product.setCategory(updatedProduct.getCategory());
				product.setPrice(updatedProduct.getPrice());
				product.setQuantity(updatedProduct.getQuantity());
				break;
			}
		}
	}

	public void deleteProduct(int id) {
		products.removeIf(product -> product.getId() == id);
	}

	public List<Product> getAllProducts() {
		return products;
	}
}
