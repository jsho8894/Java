package com.bit.day20;

import java.util.Random;
import java.util.ArrayList;


class rannum implements java.util.Comparator{
		
		public int compare(Object o1,Object o2){
			return (int)o1 - (int)o2;//������ �������
		}
		
	}

public class Ex06 {
	public static void main(String[] args) {
		//�ζ� ��ȣ ������(ver 0.1.0)
		java.util.Random random = new Random();
		java.util.List list = new java.util.ArrayList();
		
		for(int i = 0; i<6; i++){			
			int num = (int)(Math.random()*10)+1;
			list.add(num);
		}
		
		
		list.sort(new rannum());
		
		for(int i = 0; i <list.size(); i++){
			System.out.println(list.get(i));
		}
	}
}
