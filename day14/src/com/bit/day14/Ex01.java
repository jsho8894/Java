package com.bit.day14;

abstract class Lec01{
	public abstract void func01();//메서드의 선언만 있기 때문에 ;를 적어줍니다.
	
}
 class Lec11 extends Lec01{
	public void func01(){
		System.out.println("구현했음");
	}
}

public class Ex01 {
	//추상클래스(abstract)
	//추상메서드를 0개이상 갖는 클래스
	//추상메서드 - 메서드의 선언(O) 구현(X)
	//abstract를 사용하여 추상메서드를 선언할수 있게되지만 꼭사용해야하는것은 아닙니다.
	//abstract 사용하였다면 추상클래스를 만들지 않더라도 추상클래스 입니다.
	//abstract클래스는 객체생성이 안됩니다.
	
	
	public static void main(String[] args) {
		//Lec11 you = null;
		Lec11 you = new Lec11();
		you.func01();
	}
}
