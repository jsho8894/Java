package com.bit.day07;

class Ex10{
	public static void main(String[] args){
		for(int i =0;i<3;i++){
			for(int j = 0;j<4;j++){
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println("\n-----------------------------------------\n");
		int su=1;
		for(int i =0;i<4;i++){
			for(int j = 0;j<3;j++){
				System.out.print(su++);
			}
			System.out.println();
		}
		System.out.println("\n-----------------------------------------\n");
		for(int i =0;i<3;i++){
			for(int j = 0;j<3;j++){
				System.out.print(j+1+i);
			}
			System.out.println();
		}
	}
}