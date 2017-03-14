package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		System.out.println("<<디미베네 연간 인건비>>");
		int a= 1700000;
		System.out.printf("월 평균 급여 : ");
		System.out.println(String.format("%,d",a)+"원");
		int b= 3;
		System.out.println("점포 내 직원 수 : "+b+"명");
		int c =1500;
		System.out.println("점포 수  : "+String.format("%,d",c)+"개\n\n");
		long d=a*12l*b*c;
		System.out.printf("연간 인건비  : ");
		System.out.printf(String.format("%,d", d));
		System.out.println("원");
	}

}
