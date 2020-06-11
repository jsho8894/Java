package com.bit.day20;

import java.util.Iterator;
import java.util.Random;

public class Ex06e {
	public static void main(String[] args) {		
		java.util.Set lotto = new java.util.TreeSet();
		java.util.Random ran = new Random();
		while(lotto.size()<6){
			lotto.add(ran.nextInt(45)+1);
		}
		
		Iterator note = lotto.iterator();
		while(note.hasNext()){
			System.out.print(note.next()+" ");
		}
	}
}
