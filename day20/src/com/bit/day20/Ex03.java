package com.bit.day20;

import java.util.HashSet;

public class Ex03 {
	public static void main(String[] args) {
		java.util.HashSet set01 = new HashSet();
		
		set01.add("ù��°");
		set01.add("�ι�°");
		set01.add("����°");
		set01.add("�׹�°");
		set01.add("�ι�°");//set type�� �ߺ��� ������� �ʱ⶧���� ������� �ʽ��ϴ�.
		
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
