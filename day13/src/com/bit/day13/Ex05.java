package com.bit.day13;

public class Ex05 {
	int su;
	Ex05(int su){
		this.su = su;
	}
	//객체의 비교대상이 value를 무엇으로 결정할 것인가.
	public boolean equals(Object me2){
		Ex05 me = (Ex05)me2;
		return this.su == me.su;
	}
	
	public static void main(String[] args) {
		Object obj = new Object();
		Object obj2 = obj;
		Object obj3 = new Object();
		
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		System.out.println(obj.equals(obj2));
		System.out.println(obj.equals(obj3));
		System.out.println("--------------------------------------");
		Ex05 me = new Ex05(12);
		Ex05 me2 = new Ex05(12);
		System.out.println(me == me2);
		System.out.println(me.equals(me2));
		System.out.println("--------------------------------------");
		String msg = "java";
		String msg2 = new String("java");
		System.out.println(msg == msg2);
		System.out.println(msg.equals(msg2));
		System.out.println("--------------------------------------");
		Integer su1 = new Integer(100);
		Integer su2 = new Integer(100);
		System.out.println(su1 == su2);
		System.out.println(su1.equals(su2));
		
	}

}
