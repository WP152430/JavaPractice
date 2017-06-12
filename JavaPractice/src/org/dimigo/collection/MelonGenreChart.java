package org.dimigo.collection;

import java.util.*;

public class MelonGenreChart {

	public static void main(String[] args) {
		
		List<Music> l = new ArrayList<>(Arrays.asList(new Music("I LUV IT", "PSY"), new Music("맞지?", "언니쓰")));
		List<Music> l2 = new ArrayList<>(Arrays.asList(new Music("팔레트", "아이유")));
		
		Map<String, List<Music>> map = new HashMap<>();
		map.put("발라드", l2);
		map.put("댄스", l);
		
		System.out.println("--<<멜론 장르별 챠트>>--");		
		printMap(map);
		
		System.out.println("\n--<<댄스 2위 곡 변경>>--");
		l.set(1, new Music("SIGNAL", "트와이스"));
		printMap(map);
		
		System.out.println("\n--<<댄스 1위 곡 삭제>>--");
		l.remove(0);
		printMap(map);

		System.out.println("\n--<<전체 리스트 삭제>>--");
		map.clear();
		printMap(map);
		
		
	}
	
	public static void printMap(Map<String, List<Music>> map){
		for(String key : map.keySet()){
			System.out.println("["+key+"]");
			int i = 0;
			for (Music v : map.get(key)){
				i++;
				System.out.println(i+". "+v);
			}
		}
	}

}
