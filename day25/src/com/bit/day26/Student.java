package com.bit.day26;

import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//transient - 객체 직렬화의 제외 대상
	public int num;
	transient String name;
	protected int kor;
	int eng;
	private int math;
	
	public Student(int num,String name,int kor,int eng, int math){
		this.num = num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void show(){
		System.out.println(num+"번"+name+"은 국어"+kor+"점, 영어"+eng+"점 ,수학"+math+"점 입니다");
	}
	public String toString(){
		return num+"번"+name+"은 국어"+kor+"점, 영어"+eng+"점 ,수학"+math+"점 입니다";
	}
}

