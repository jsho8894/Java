package com.bit.day20;

import java.util.HashSet;

public class Ex03 {
	public static void main(String[] args) {
		java.util.HashSet set01 = new HashSet();
		
		set01.add("첫번째");
		set01.add("두번째");
		set01.add("세번째");
		set01.add("네번째");
		set01.add("두번째");//set type은 중복을 허용하지 않기때문에 저장되지 않습니다.
		
		System.out.println(set01.size());
		
		java.util.Iterator ite = set01.iterator();
		while(ite.hasNext()){
			System.out.println(ite.next() );
		}
		
		
		
//		for(int i = 0; i < set01.size(); i++){
//			System.out.println(ite.next());
//		}
		
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());
//		System.out.println(ite.next());
		
		
		
	}
}
