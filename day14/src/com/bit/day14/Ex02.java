package com.bit.day14;
abstract class Machine{
	abstract void work();//상속받아서 구현
	void on(){
		System.out.println("환영합니다.");
	}
	void off(){
		System.out.println("전원을 종료합니다.");
	}
}

class Tv extends Machine{
	void work(){
		System.out.println("화면과 소리를 재생한다.");
	}
}
class Radio extends Machine{
	void work(){
		System.out.println("주파수를 잡아 소리를 들려준다.");
	}
}
class Audio extends Machine{
	void work(){
		System.out.println("음악을 틀어준다.");
	}
}//
public class Ex02 {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		Machine remote = null;
		//Machine remote = new Audio();
		while(true){
			System.out.println("1.TV 2.Radio 3.Audio 0.종료>>");
			int input =sc.nextInt();
			if(input==0){
				break;
			}else if(input==1){
				remote = new Tv();
			}else if(input==2){
				remote = new Radio();
			}else if(input==3){
				remote = new Audio();
			}
			remote.on();
			remote.off();
			remote.work();
		}
	}
}
