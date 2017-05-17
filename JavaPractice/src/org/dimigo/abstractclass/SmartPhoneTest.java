package org.dimigo.abstractclass;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] sp ={new IPhone("iPhone 7", "애플",900000),
				new Galaxy("갤럭시 S8", "삼성",800000)};
		for(SmartPhone s : sp){
			System.out.println();
			s.turnOn();
			s.pay();
			s.useSpecialFunction();
			s.turnOff();
			System.out.println("------------------------------------------");
			
		}
	}

}
