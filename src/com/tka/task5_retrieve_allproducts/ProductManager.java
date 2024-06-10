package com.tka.task5_retrieve_allproducts;

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
	public String productDisplay() {
		try {
			System.out.println("Product List");
			if(productList.isEmpty()) {
				return "product not exist";
			}
			else {
				return productList.toString();
			}
		}catch(Exception e) {
		return "something went wrong";
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
			System.out.println("    1. To Add Product   \t  2. To Display Product ");
			System.out.println("    3. To Exit");
			System.out.println();
			System.out.println("====================== Enter Your Choice =====================");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				productManager.addProduct();
				break;
			}
			
			case 2:{
				String msg = productManager.productDisplay();
				System.out.println(msg);
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
