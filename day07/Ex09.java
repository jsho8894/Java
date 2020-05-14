package com.bit.day07;

class Ex09{
	public static void main(String[] args){
		//A~ZÃâ·Â
		for(int i = 0; i<('Z'-'A'+1) ; i++){
			char tmp=(char)('A'+i);
			System.out.print(tmp+" ");
		} 
		System.out.print("\n---------------------------------\n");
		//
		for(int i = 0; i<('z'-'a'+1) ; i++){
			char tmp=(char)('a'+i);
			System.out.print(tmp+" ");
		} 
		System.out.print("\n---------------------------------\n");
		//
		for(int i = 0; i<('Z'-'A'+1) ; i++){
			char tmp=(char)('A'+i);
			char tmp2=(char)(tmp+'a'-'A');
			System.out.print(tmp+"("+tmp2+")"+" ");
		} 
		System.out.print("\n---------------------------------\n");
		//
		for(int i = 1; i<16; i++){
			if(i%5 != 0){
				System.out.print("*");
			}else{
			System.out.println();
			}
		}
		System.out.print("\n---------------------------------\n");
		//
		int su = 1;
		for(int i = 1; i<13; i++){
			if(i%4!=0){
				System.out.print(su++);
				System.out.print(" ");
			}else{
				System.out.println();
			}
		}
		System.out.print("\n---------------------------------\n");
		//
		int limit = 3;
		for(int i = 1; i<6; i++){
			System.out.print(i);
			if(limit==i){
				limit++;
				i -=2;
				System.out.println();
				if(limit==6){break;}
			}
		}
		
	}
}