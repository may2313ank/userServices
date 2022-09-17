package com.mayank.bean;


public class User {

	private Integer userId;

	private String userName;

	private String city;
	
	private String state;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String city, String state) {
		super();
		this.userName = userName;
		this.city = city;
		this.state = state;
	}

	public User(Integer userId, String userName, String city, String state) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.city = city;
		this.state = state;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
