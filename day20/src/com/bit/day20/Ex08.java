package com.bit.day20;

class Com{
	void play(){
		System.out.println("������ ���� ���");
	}
}

class Ball{
	String color = "������";
	void play(){
		System.out.println(color+"���� �������ϴ�.");
	}
}
class BaseBall extends Ball{
	String color = "���";
	void play(){
		System.out.print("������ ����� �ֽ��ϴ�.");
	}
}
class Bowling extends Ball{
	String color = "��Ȳ��";
	void play(){
		System.out.print("���� ����");
		super.play();
	}
}
class Box<T>{
	private T myBall;
	
	void push(T myBall){
		this.myBall = myBall;
	}
	T pull(){
		return myBall;
	}
}



public class Ex08 {
	public static void main(String[] args) {
		BaseBall base = new BaseBall();
		Bowling bow = new Bowling();
		Com com = new Com();
		
		Box<Bowling> box = new Box<Bowling>();
		box.push(bow);
		
		Bowling ball2 = box.pull();
		ball2.play();
	}
}
