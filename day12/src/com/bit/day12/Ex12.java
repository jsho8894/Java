package com.bit.day12;

public class Ex12 {
	public static void main(String[] args) {
		java.util.Scanner sc =null;
		sc = new java.util.Scanner(System.in);
		String input = null;	
		char[] ju1 = new char[6];
		char[] ju2 = new char[7];
		System.out.print("주민번호 입력:");
		input = sc.nextLine();
		try{
			for(int i = 0; i<ju1.length; i++){
				ju1[i]=(char)('0'+Integer.parseInt(""+input.charAt(i)));
			}
			if(input.charAt(6)!='-'){
				Exception err = new Exception();
				throw err;
			}
			for(int i=0; i <ju2.length; i++){
				ju2[i]=(char)('0'+Integer.parseInt(""+input.charAt(i+ju1.length+1)));
			}
		}catch(Exception e){
			System.out.print("다시 확인하고 입력하여주세요");
		}
		System.out.println("처리완료...");
	}
}
