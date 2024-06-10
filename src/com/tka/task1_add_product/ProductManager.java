package com.tka.task1_add_product;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {
	 private ArrayList<Product> productList;

	    public ProductManager() {
	        productList = new ArrayList<>();
	    }

	    public String addProduct(Product product) {
	        if (productList.contains(product)) {
	            return "Product already exists";
	        } else {
	            productList.add(product);
	            return "Added Successfully";
	        }
	    }

	    public static void main(String[] args) {
	        ProductManager productManager = new ProductManager();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Enter Product ID:");
	            int productId = scanner.nextInt();

	            System.out.println("Enter Product Name:");
	            String productName = scanner.next();
	            scanner.nextLine();

	            System.out.println("Enter Product Quantity:");
	            int productQuantity = scanner.nextInt();

	            System.out.println("Enter Product Price:");
	            double productPrice = scanner.nextDouble();

	            System.out.println("Enter Manufacturing Date (yyyy-mm-dd):");
	            String mfgDateStr = scanner.next();
	            

	            System.out.println("Enter Expiry Date (yyyy-mm-dd):");
	            String expDateStr = scanner.next();
	           

	           Product product = new Product(productId, productName, productQuantity, productPrice, mfgDateStr, expDateStr);
	            String result = productManager.addProduct(product);

	            System.out.println(result);
	            System.out.println("Do you want to add another product? (yes/no)");
	            String choice = scanner.next();
	            if (!choice.equalsIgnoreCase("yes")) {
	                break;
	            }
	        }

	        scanner.close();
	    }


}
