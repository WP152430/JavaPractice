package org.dimigo.basic;

/**
 * 
 * <pre> 
 * ${package_name}
 *   |_ ${type_name}
 * 1. 개요 : 
 * 2. 작성일 : ${date}
 *
 *</pre>
 *
 * @author ${user}
 * @version : 1.0
 */

public class PrimitiveDataType {

	public static void main(String[] args) {

		String name="아이유";
		boolean isMale=false;
		int age=25;
		double height=161.8;
		float weight=44.3f;
		char bloodType='A';
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : "+name);
		if(!isMale){
			System.out.println("성별 : 여자");//System.out.println(isMale ? "남자" : "여자");
		}
		else{
			System.out.println("성별 : 남자");
		}
		System.out.println("나이 : "+age+"세");
		System.out.println("키 : "+height+"cm");
		System.out.println("몸무게 : "+weight+"kg");
		System.out.println("혈액형 : "+bloodType+"형");


	}
}
