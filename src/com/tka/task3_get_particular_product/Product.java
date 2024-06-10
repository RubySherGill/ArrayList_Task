package com.tka.task3_get_particular_product;

public class Product {
	private int id;
	private String name;
	private int quantity;
	private double price;
	private String manufactureDate;
	private String expiryDate;

	public Product() {
		super();

	}

	public Product(int id, String name, int quantity, double price, String manufactureDate, String expiryDate) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", quantity=" + quantity + ", price=" + price
				+ ", manufactureDate=" + manufactureDate + ", expiryDate=" + expiryDate + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Product product = (Product) o;

		if (id != product.id) return false;
		if (quantity != product.quantity) return false;
		if (Double.compare(product.price, price) != 0) return false;
		if (!name.equals(product.name)) return false;
		if (!manufactureDate.equals(product.manufactureDate)) return false;
		return expiryDate.equals(product.expiryDate);
	}

	@Override
	public int hashCode() {
		int result;
		long temp;
		result = id;
		result = 31 * result + name.hashCode();
		result = 31 * result + quantity;
		temp = Double.doubleToLongBits(price);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		result = 31 * result + manufactureDate.hashCode();
		result = 31 * result + expiryDate.hashCode();
		return result;
	}

}
