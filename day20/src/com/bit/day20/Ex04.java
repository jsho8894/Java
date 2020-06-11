package com.bit.day20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;


class MyCar implements Comparable

{
	int su;
	MyCar(int a){su = a;}
	
	public int compareTo(Object obj){
		return su - ((MyCar)obj).su;
	}
}

public class Ex04 {
	public static void main(String[] args) {
		java.util.Set set1 = new java.util.TreeSet();
	
		
		set1.add(new MyCar(1));
		set1.add(new MyCar(2));
		set1.add(new MyCar(3));
		set1.add(new MyCar(4));


		
		
		
//		set1.add(1111);
//		set1.add(2222);
//		set1.add(3333);
//		set1.add(4444);
//		set1.add("ac");
//		set1.add("abc");
//		set1.add("abce");
//		set1.add("abcd");

		
		Iterator ite = set1.iterator();
		while(ite.hasNext()){
			MyCar car = (MyCar)ite.next();
			System.out.print(car.su+" ");
		}
	}
}
