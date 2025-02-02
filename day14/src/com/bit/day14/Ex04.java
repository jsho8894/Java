package com.bit.day14;

interface Inter01{
	//예외적으로 public static final 변수만 가능
	//예외적으로 메서드 앞에 public abstract 생략가능
	public static final int su1 = 1111;
	static final int su2 = 2222;//public생략가능
	final int su3 = 3333;//static 생략가능
	int su4 = 4444;//상수만 사용가능하므로 final 생략가능
	public abstract void func01();
	public void func02();//abstract생략가능
	void func03();//default(X) public(O)
}

interface Inter02{}
interface Inter03{}
//클래스의 정보
//분류,제약
public class Ex04 extends Object implements Inter01,Inter02,Inter03{

	public static void main(String[] args) {
		Inter01 me = new Ex04();
		me.func01();
		me.func02();
		me.func03();
		System.out.println(Inter01.su1);
		System.out.println(Inter01.su2);
		System.out.println(Inter01.su3);
		System.out.println(Inter01.su4);
	}

	@Override
	public void func01() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func02() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void func03() {
		// TODO Auto-generated method stub
		
	}
}
