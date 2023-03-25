package com.multi.www.web03;

public class Coffee2 {
	//멤버변수
	//멤버메서드
	//toString()
	//객체생성시 멤버변수값을 한꺼번에 넣어서 초기화하고 싶어요!
	//->객체생성시 자동호출되는 메서드를 추가해주세요.
	//-> 생성자 (메서드), constructor
	 //주소(4바이트)
	int price = 5000;	//4
	String name = "핸드드립";	//4
	
	public static Coffee2 coffee2; //null
	
	public static Coffee2 getInstance() {
		if (coffee2 == null) {
			coffee2 = new Coffee2();
		}
		return coffee2; //접근할 수 있는 변수가 같은 static이 되어야한다.
	}
	private Coffee2() {
	}
	
	

	
	
	
}
