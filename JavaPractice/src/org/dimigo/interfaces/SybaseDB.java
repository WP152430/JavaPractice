package org.dimigo.interfaces;

public class SybaseDB implements IDBManager{

	public void insert(){
		System.out.println("Sybase DB 저장");
		
	}
	public void search(){
		
		System.out.println("Sybase DB 조회");
	}
	public void update(){
		
		System.out.println("Sybase DB 변경");
	}
	public void delete(){
		System.out.println("Sybase DB 삭제");
		
	}
}
