package org.dimigo.oop;

public class Snack {
	String name;
	String company;
	int price;
	int number;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Snack(){
		
	}
	public Snack(String name, String company, int price, int number) {
		super();
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}
	public int calcPrice(){
		return price*number;
	}
	public String toString(){
		return "이름 : "+name+"\n제조사 : "+company+"\n가격 : "+ String.format("%,d", price)+"원\n개수 : "+number+"개\n";
		
	}
}
