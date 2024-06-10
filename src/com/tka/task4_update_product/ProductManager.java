package com.tka.task4_update_product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
	static Scanner scanner = new Scanner(System.in);
	ArrayList<Product> productList;

	public ProductManager() {
		productList = new ArrayList<>();
	}

	public void addProduct() {
		System.out.println("Enter Product Id");
		int productId = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter product Name");
		String productName = scanner.nextLine();
		System.out.println("Enter product Quantity");
		int productQuantity = scanner.nextInt();
		System.out.println("Enter product price");
		double productPrice = scanner.nextDouble();
		System.out.println("Enter product Mfg. Date (yyyy-mm-dd)");
		String productMfgDate = scanner.next();
		System.out.println("Enter product Exp. Date (yyyy-mm-dd)");
		String productExpireDate = scanner.next();
		System.out.println();
		Product product = new Product(productId, productName, productQuantity, productPrice, productMfgDate,
				productExpireDate);
		if (productList.contains(product)) {
			System.out.println("Product already exist in list");
		} else {
			productList.add(product);
			System.out.println("Product added successfully!!!");
		}
	}

	public Product updateProduct() {
		System.out.println("Enter product name to update details");
		String name = scanner.next();
		for (Product product : productList) {
			if (product.getName().equalsIgnoreCase(name)) {
				return product;
			}
		}
		return null;
	}

	public void productDisplay() {
		System.out.println("Product List");
		for (Product product : productList) {
			System.out.println(product);
		}
	}

	public void exit() {
		System.out.println("Thanks to visit our Application...");
	}

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		while (true) {
			System.out.println("============ Welcome to Product Management System ===========");
			System.out.println();
			System.out.println("    1. To Add Product   \t  2. To Update Product");
			System.out.println("    3. Display Product  \t  4. To Exit");
			System.out.println();
			System.out.println("====================== Enter Your Choice =====================");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				productManager.addProduct();
				break;
			}
			case 2: {
				Product product = productManager.updateProduct();
				if (product != null) {
					System.out.println("Enter Product Id");
					int newProductId = scanner.nextInt();
					scanner.nextLine();
					System.out.println("Enter product Name");
					String newProductName = scanner.nextLine();
					System.out.println("Enter product Quantity");
					int newProductQuantity = scanner.nextInt();
					System.out.println("Enter product price");
					double newProductPrice = scanner.nextDouble();
					System.out.println("Enter product Mfg. Date (yyyy-mm-dd)");
					String newProductMfgDate = scanner.next();
					System.out.println("Enter product Exp. Date (yyyy-mm-dd)");
					String newProductExpireDate = scanner.next();
					System.out.println();

					product.setId(newProductId);
					product.setName(newProductName);
					product.setQuantity(newProductQuantity);
					product.setPrice(newProductPrice);
					product.setManufactureDate(newProductMfgDate);
					product.setExpiryDate(newProductExpireDate);

					System.out.println("Product " + product.getName() + " updated successfully!!!!");
				} else if (product == null) {
					System.out.println("Product not exist");
				} else {
					System.out.println("something went wrong");
				}
				break;

			}
			case 3: {
				productManager.productDisplay();
				break;
			}
			case 4: {
				productManager.exit();
				return;
			}
			default: {
				System.out.println("Enter a valid Choice");
			}
			}

		}
	}

}
