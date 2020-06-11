package com.bit.day19;

import java.util.LinkedList;

public class Ex06 {
	public static void main(String[] args) {
		//Queue 선입 선출
		
		java.util.Queue list =new LinkedList();
		list.offer("첫번째");//list.add
		list.offer("두번째");
		list.offer("세번째");
		list.offer("네번째");
		
//		for(int i = 0; i <4; i++){
//			String msg = (String)list.peek();
//			System.out.println(msg);
//			System.out.println(list.poll());
//		}
		while(list.peek() != null){
			String msg = (String)list.poll();
			System.out.println(msg);
		}
	}
}
