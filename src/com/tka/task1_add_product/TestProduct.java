package com.tka.task1_add_product;

import java.util.ArrayList;
import java.util.Scanner;

public class TestProduct {
	static ArrayList<Product> addProductList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void addProduct() {

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
		String result = productList(product);
		System.out.println(result);

	}

	public static String productList(Product product) {
		if (addProductList.contains(product)) {
			return "Product already exist in the list";
		} else {
			addProductList.add(product);
			return "Product added successfully";
		}

	}

	public static void exit() {
		System.out.println("Thanks to visit our Application...");
	}

	public static void main(String[] args) {
		while (true) {
			System.out.println("========= Welcome to Product Management System =======");
			System.out.println();
			System.out.println("1. To Add Product  \t \t  2. To Exit");
			System.out.println();
			System.out.println("=================== Enter Your Choice =================");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				addProduct();
				break;
			}
			case 2: {
				exit();
				return;
			}
			default: {
				System.out.println("Enter a valid Choice");
			}
			}

		}
	}

}
