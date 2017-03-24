package org.dimigo.oop;

public class CarTest2 {

	public static void main(String[] args) {
		Car2[] a=new Car2[3];
		
		a[0]=new Car2("현대자동차","제네시스","검정색",225,50000000);
		a[1]=new Car2("기아자동차","K7","흰색",246,40000000);
		a[2]=new Car2("삼성자동차","SM7","회색",200,38000000);
//		a[0].setColor("검정색");
//		a[1].setColor("흰색");
//		a[2].setColor("회색");
//
//		a[0].setCompany("현대자동차");
//		a[1].setCompany("기아자동차");
//		a[2].setCompany("삼성자동차");
//		
//		a[0].setModel("제네시스");
//		a[1].setModel("K7");
//		a[2].setModel("SM7");
//		
//		a[0].setMaxSpeed(225);
//		a[1].setMaxSpeed(246);
//		a[2].setMaxSpeed(200);
//		
//		a[0].setPrice(50000000);
//		a[1].setPrice(40000000);
//		a[2].setPrice(38000000);
		
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
