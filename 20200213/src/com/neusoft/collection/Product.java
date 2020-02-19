package com.neusoft.collection;

public class Product {

	public Product() {
		
	}
	
	
	@Override
	public String toString() {
		return "Product [proId=" + proId + ", proName=" + proName + ", proImg=" + proImg + ", price=" + price
				+ ", stock=" + stock + "]";
	}


	public int getProId() {
		return proId;
	}


	public void setProId(int proId) {
		this.proId = proId;
	}


	public String getProName() {
		return proName;
	}


	public void setProName(String proName) {
		this.proName = proName;
	}


	public String getProImg() {
		return proImg;
	}


	public void setProImg(String proImg) {
		this.proImg = proImg;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getStock() {
		return stock;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public Product(int proId, String proName, String proImg, double price, int stock) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.proImg = proImg;
		this.price = price;
		this.stock = stock;
	}


	private int proId;
	
	private String proName;
	
	private String proImg;
	
	private double price;
	
	private int stock;
	
	
}