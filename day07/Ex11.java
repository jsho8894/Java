package com.bit.day07;

class Ex11{
	public static void main(String[] args){
	//문제1. 별 계단4층
		for(int i = 1; i<5; i++){
			for(int j = 0; j < i; j++){
				if(i>j){
				System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.print("\n---------------------------------\n");
	//문제2. 숫자 계단 4층 단 1,2,3만 출력
		int su = 1;
		for(int i = 1; i<5; i++){
			for(int j = 0; j < i; j++){
				if(i>j){
				System.out.print(su+j);
				}
			}
			System.out.println();
		}
		System.out.print("\n---------------------------------\n");
	//문제3. 숫자 계단 4층 1~10까지 출력
		su = 1;
		for(int i = 1; i<5; i++){
			for(int j = 0; j < i; j++){
				if(i>j){
				System.out.print(su++ +" ");
				}
			}
			System.out.println();
		}
		System.out.print("\n---------------------------------\n");
	//문제4. 영어 대문자 계단4층 A~J까지
		char tmp=(char)('A');
		for(int i = 0; i<5 ; i++){
			for(int j = 0; j<i; j++){
				if(i>j){
					
					System.out.print((char)tmp);
					tmp++;
				}
			}
			System.out.println();
		}
		System.out.print("\n---------------------------------\n");
	//문제5. 숫자 계단 4층 세로는 1씩증가 가로는 1씩감소
		su = 0;
		for(int i = 1; i<5; i++){
			for(int j = 0; j < i; j++){
				if(i>j){
				System.out.print(i-su);
				}
			}
			System.out.println();
		}
		System.out.print("\n---------------------------------\n");
	//문제6. 별 계단4층 4,3,2,1,순
		for(int i = 0; i<5; i++){
			for(int j = 1; j < 5; j++){
				if(i<j){
				System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.print("\n---------------------------------\n");
	//문제7. 별 계단4층 문제 1번 반대로
		for(int i = 1; i<5; i++){
			for(int j = 4; j > 0; j--){
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}	
			}
			System.out.println("");
		}

		System.out.print("\n---------------------------------\n");
	//문제8. 별 계단4층 마름모 만들기
	}
}