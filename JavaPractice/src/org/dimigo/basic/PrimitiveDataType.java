package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
//		- 이름(name, String), 성별(isMale, boolean), 나이(age, int)
//		- 키(height, double), 몸무게(weight, float), 혈액형(bloodType, char)
		
//		<< 아이유 프로필 >>
//		이름 : 아이유
//		성별 : 여자
//		나이 : 25세
//		키 : 161.8cm
//		몸무게 : 44.3kg
//		혈액형 : A형
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
