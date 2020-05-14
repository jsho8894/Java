package com.bit.day07;

public class Ex01{//메서드
//1.정적 메서드,클래스메서드,static메서드...
//2.인스턴스 메서드,non-static 메서드....
	public void func01(){//만약 바로 호출하면 오류가 나옵니다
		System.out.println("non-static method...");
		System.out.println("인스턴스 메서드");
	}

	public static void func02(){//인스턴스 메서드와 클래스 메서드는 서로 오버로딩을 할수 없습니다.
		System.out.println("static 메서드");
		System.out.println("클래스 메서드");
		System.out.println("정적 메서드");
	}

	
	public static void main(String[] args){
		func02();
		System.out.println("-----------------------------------------------");
		//func01()//만약 바로 호출하면 오류가 나옵니다
		Ex01 me = new Ex01();//클래스명 참조변수 = new 클래스명();
		me.func01();//이런식으로 참조변수를 지정해야지만 사용이 가능합니다.
		System.out.println("-----------------------------------------------");
		me.func02();//실행은 되지만 인스턴스인지 static인지 알수가 없어 사용하지 않는것을 추천합니다.
	}
}