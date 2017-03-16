package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class Loop {

	public static void main(String[] args) {
		int at =100;
		int choice;
		boolean a=true;
		Scanner s = new Scanner(System.in);
		while(a){
			System.out.println("------------------------");
			System.out.println("<<게임메뉴>>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("------------------------");
			System.out.print("메뉴 입력 => ");
			choice=s.nextInt();
			switch (choice){
			case 1:
				at+=10;
				System.out.println("공격력이 증가되었습니다. 현재 공격력 : "+at);
				break;
			case 2:
				at-=10;
				System.out.println("공격력이 감소되었습니다. 현재 공격력 : "+at);
				break;
			case 3:
				int num = new Random().nextInt(4);
				String[] dd = { "마법사", "영주", "기사", "농민" };
				System.out.println(dd[num]+"(으)로 설정되었습니다.");
				break;
			case 9:
				System.out.println("이제 공부하세요!");
				a=false;
				
			}
		}

		s.close();
	}

}
