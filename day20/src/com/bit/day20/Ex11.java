package com.bit.day20;

import java.util.ArrayList;

class Lec1<T>{
	T obj;
	void sutObj(T obj){
		this.obj = obj;
	}
	T getObj(){
		return obj;
	}
	void func(java.util.List<? extends Number> list){
		for (int i = 0; i <list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}

public class Ex11 {
	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<Integer>();
		Lec1<Number> lec = new Lec1<>();
		lec.func(list);
		
		
		
		
		
		//<?>와일드 타입
		//<? super Number> Number 기준위로
		//<? extends Number>Number 기준 아래로
		//
		Lec1<? super Number> lec1 = new Lec1<>();
//		Lec1<String> lec2 = (Lec1<String>) lec1;
		
		lec1.sutObj(1234);
		Object msg = lec1.getObj();
		System.out.println(lec1.getObj());
	}
}
