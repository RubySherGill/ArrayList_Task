package com.tka.task6_greater_price_product;

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

	public Product productPriceGreaterThan() {
		System.out.println("Enter price of product");
		double price = scanner.nextDouble();
		for (Product product : productList) {
			if (product.getPrice() > price) {
				return product;
			}
		}
		return null;
	}
	
//	public void productPriceGreaterThan() {
//		try {
//			System.out.println("Enter price of product");
//			double price = scanner.nextDouble();
//			ArrayList<Product> greaterPrice = new ArrayList<>();
//		    for(Product product :productList) {
//				if(product.getPrice() > price) {
//					greaterPrice.add(product);
//				}
//			}
//		    if(greaterPrice!=null) {
//		    	System.out.println("Product list found");
//		    	for(Product product : greaterPrice) {
//		    		System.out.println(product);
//		    	}
//		    }
//		    else {
//		    	System.out.println("Product does not found");
//		    }
//		}catch(Exception e) {
//			System.out.println("Something went wrong");
//		}
//		
//	}

	public void exit() {
		System.out.println("Thanks to visit our Application...");
	}

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		while (true) {
			System.out.println("=============== Welcome to Product Management System ==============");
			System.out.println();
			System.out.println("\t\t\t1. To Add Product ");
			System.out.println("\t2. Display product with greater price than specified amount");
			System.out.println("\t\t\t3. To Exit");
			System.out.println();
			System.out.println("========================= Enter Your Choice ========================");
			int choice = scanner.nextInt();
			switch (choice) {
			case 1: {
				productManager.addProduct();
				break;
			}

			case 2: {
				Product product = productManager.productPriceGreaterThan();
				if (product != null) {
					System.out.println(product);
				} else {
					System.out.println("Product not found");
				}
				//productManager.productPriceGreaterThan();

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
