package com.bit.day07;

class Ex08{
	public static void main(String[] args){
		System.out.println("main start...");
		for(int i=0; i<11; i++){
			System.out.print("확인");
			if(i%2!=0){continue;}//스킵
			//if(i>2){break;}//break를 만나면 코드를 탈출하여 다음코드까지 출력된후 숨겨진 return을 사용된다
			//if(i>2){return;}//메인을 종료
			System.out.println("반복"+(i));
		}
		System.out.println("main end...");
	}
}