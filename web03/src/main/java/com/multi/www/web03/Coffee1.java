package com.multi.www.web03;

public class Coffee1 {
	//멤버변수
	//멤버메서드
	//toString()
	//객체생성시 멤버변수값을 한꺼번에 넣어서 초기화하고 싶어요!
	//->객체생성시 자동호출되는 메서드를 추가해주세요.
	//-> 생성자 (메서드), constructor
	 //주소(4바이트)
	int price;	//4
	String name;	//4
	
	
	public Coffee1(int price, String name) {
		
		this.price = price;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Coffee1 [price=" + price + ", name=" + name + "]";
	}
	
	
	
	
	
}
