package com.bit.day19;

import java.util.LinkedList;

public class Ex03 {
	public static void main(String[] args) {
		java.util.ArrayList list = new java.util.ArrayList();
		java.util.LinkedList list2 = new LinkedList();				
		for(int i = 0; i<99999; i++){
			list.add(i);
		}
		
		long before = System.currentTimeMillis();
		Object temp = null;
		for(int i = 0; i<99999;i++){
			temp = list.get(i);
		}
		long after = System.currentTimeMillis();
		System.out.println(after-before);
	}
}
