package org.dimigo.oop;

public class CarTest3 {

	public static void main(String[] args) {
		Car3[] a=new Car3[3];
		
		a[0]=new Car3("현대자동차","제네시스","검정색",225,50000000);
		a[1]=new Car3("기아자동차","K7","흰색",246);
		a[2]=new Car3("삼성자동차","SM7","회색");
		
		System.out.println("<<자동차 목록>>");
		for(int j=0;j<3;j++){
			System.out.println("제조사명 : "+a[j].getCompany());
			System.out.println("모델명 : "+a[j].getModel());
			System.out.println("색상 : "+a[j].getColor());
			System.out.println("최대속도 : "+a[j].getMaxSpeed()+"km");
			System.out.println("가격 : "+String.format("%,d",a[j].getPrice())+"원\n");
		}
	}
}
