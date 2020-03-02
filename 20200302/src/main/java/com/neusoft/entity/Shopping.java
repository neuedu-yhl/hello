package com.neusoft.entity;

import lombok.Data;

@Data
public class Shopping {

	public Shopping() {
		
	}
	

	public Shopping(Integer shopId, String shopName, Double price) {
		this.shopId = shopId;
		this.shopName = shopName;
		this.price = price;
	}



	private Integer shopId;
	
	private String shopName;
	
	private Double price;
	
	
}