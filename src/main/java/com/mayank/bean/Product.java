package com.mayank.bean;


public class Product {

	private Integer productId;

	private String productName;

	private Double productprice;

	public Product() {
		super();

	}

	public Product(Integer productId, String productName, Double productprice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productprice = productprice;
	}

	public Product(String productName, Double productprice) {
		super();
		this.productName = productName;
		this.productprice = productprice;
	}

	public Integer getProductId() {
		return productId;
	}



	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductprice() {
		return productprice;
	}

	public void setProductprice(Double productprice) {
		this.productprice = productprice;
	}


}
