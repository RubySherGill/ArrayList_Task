package com.tka.task3_get_particular_product;

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

//	public void getProduct() {
//		System.out.println("Enter Product Name to Found");
//		String productName = scanner.next();
//		ArrayList<Product> findByName = new ArrayList<>();
//		for (Product product : productList) {
//			if (product.getName().equalsIgnoreCase(productName)) {
//				findByName.add(product);
//			}
//		}
//		if (findByName != null) {
//			System.out.println("Product list get by Nmae");
//			for (Product productfound : findByName) {
//				System.out.println(productfound);
//			}
//		}
//		else {
//			System.out.println("Product does not Exist");
//		}
//	}

	public Product getProductByName() {
		System.out.println("Enter Product Name to Search");
		String name = scanner.next();
		for (Product product : productList) {
			if (product.getName().equalsIgnoreCase(name)) {
				return product;
			}
		}
		return null;
	}

	public void exit() {
		System.out.println("Thanks to visit our Application...");
	}

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		while (true) {
			System.out.println("===================== Welcome to Product Management System ==================");
			System.out.println();
			System.out.println("1. To Add Product \t 2. To Get Product By Name \t 3. To Exit");
			System.out.println();
			System.out.println("============================= Enter Your Choice =============================");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				productManager.addProduct();
				break;
			}
			case 2: {
				Product product = productManager.getProductByName();
				if (product != null) {
					System.out.println("Product found: " + product);
				} else {
					System.out.println("Product not exist");
				}
				break;
			}
			case 3: {
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
