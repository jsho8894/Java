package src.com.bit.day09;

public class Ex01{
	//메서드(객체의 기능)
		//static 클래스 메서드
		//non-static 인스턴스 메서드
	//변수(객체의 속성)
		//static - 정적,전역변수
		//non-static 맴버 필드
	int su = 1234;
	static int su2 = 4321;
	//생성자
	//생성자의 이름은 클래스명이기 떄문에 변환이 불가능합니다.
	//클래스명(){}
	//default 생성자는 인자가 생략가능합니다 - 클래스명(인자x){}
	//default 생성자의 경우는 다른생성자가 존재하지 않을시 생성가능
	//생략 가능
	//public Ex(){}
	public Ex01(){//생성자로 사용할시 void를 사용하면안됩니다
		System.out.println("객체를 생성합니다.");
		return;//사용가능
	}

	
	public static void main(String[] args){
		//java.util.Scanner sc = new java.util.Scanner();//클래스 생성자는 인자가 꼭있어야 합니다.
		//변수의 선언
		Ex01 me;
		//변수의 초기화
		// new 다음으로 나오는 이름은 생성자입니다.
		me = new Ex01();
		System.out.println("su="+me.su);
	}
	public static void func01(){
		System.out.println("static method func01");
	}
		public static void func02(){
		System.out.println("non-static method2 func02");
	}
}