package com.bit.day14;

interface Inter05 extends Inter04,Inter03{//인터페이스끼리는 exterds를 사용하더라도 다중상속이 가능합니다
	void func02();

}

public class Ex05 implements Inter05{
	
	public static void main(String[] args) {
		
	}
	@Override
	public void func02() {
		
	}
	
	@Override
	public void func01() {
		
	}
	
}
