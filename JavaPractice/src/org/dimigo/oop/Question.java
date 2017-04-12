package org.dimigo.oop;

import java.util.*;

public class Question {
	public static void main(String[] args) {
		String q[] = { "가장 좋아하는 가수는?", "가장 좋아하는 배우는?", "가장 좋아하는 과목는?" };
		String a[] = { "빅뱅", "원빈", "응용 프로그래밍" };

		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println(q[i]);
			System.out.println(scanner.nextLine().equals(a[i]) ? "정답입니다!" : "틀렸습니다!");
		}
		scanner.close();

		System.out.println("<<결과 출력>>");
		StringBuilder l = new StringBuilder();
		for (int i = 0; i < 3; i++) {
			l.append(q[i]+" "+a[i]+"입니다.\n");
		}
		System.out.println(l);

	}
}
