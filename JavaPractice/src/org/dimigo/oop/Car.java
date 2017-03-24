package org.dimigo.oop;

public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	String getCompany(){
		return company;
	}
	String getModel(){
		return model;
	}
	String getColor(){
		return color;
	}
	int getMaxSpeed(){
		return maxSpeed;
	}
	int getPrice(){
		return price;
	}
	
	void setCompany(String newCompany){
		company=newCompany;
	}
	void setModel(String newModel){
		model=newModel;
	}
	void setColor(String newColor){
		color=newColor;
	}
	void setMaxSpeed(int newMaxSpeed){
		maxSpeed=newMaxSpeed;
	}
	void setPrice(int newPrice){
		price=newPrice;
	}
}