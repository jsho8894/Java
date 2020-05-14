package com.bit.day07;

class Ex02{
	/*
		메서드 호출 법칙
		1.(direct call)non-static method - static method
		2.(direct call)non-static method - non-static method
		3.(direct call)static method - static method
		4.(reference use)static method - non-static method
		static method - non-static method만 참조변수를 사용하라는 문구가 나옵니다.	
	*/

	public static void main(String[] args){
		//Ex02 me = new Ex02();
		//me.func02();
		func01();
	}
	public static void func01(){
		System.out.println("static method1");
		func11();
		//func22();
	}
	public void func02(){
		System.out.println("non-static method1");
		func11();
		//func22();
	}
	public static void func11(){
		System.out.println("static method2");
	}
	public void func22(){
		System.out.println("non-static method2");
	}
}