package org.dimigo.collection;

import java.util.*;

public class MelonChart {

	public static void main(String[] args) {

		List<Music> l = new ArrayList<>(Arrays.asList(new Music("I LUV IT", "PSY"), new Music("맞지?", "언니쓰")));
		System.out.println("-- << 멜론 챠트 >> --");
		printList(l);

		l.add(1, new Music("SIGNAL", "트와이스"));
		System.out.println("-- << 2위 곡 추가 >> --");
		printList(l);
		
		l.set(2, new Music("팔레트", "아이유"));
		System.out.println("-- << 3위 곡 변경 >> --");
		printList(l);

		l.remove(1);
		System.out.println("-- << 2위 곡 삭제 >> --");
		printList(l);

		l.clear();
		System.out.println("-- << 전체 리스트 삭제 >> --");
		printList(l);

	}

	public static void printList(List<Music> list) {

		int i = 1;
		for (Music v : list){
			System.out.println(i+". "+v);
			i++;
		}
		System.out.println();

	}
}
