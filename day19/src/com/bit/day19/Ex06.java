package com.bit.day19;

import java.util.LinkedList;

public class Ex06 {
	public static void main(String[] args) {
		//Queue ���� ����
		
		java.util.Queue list =new LinkedList();
		list.offer("ù��°");//list.add
		list.offer("�ι�°");
		list.offer("����°");
		list.offer("�׹�°");
		
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
