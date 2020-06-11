package com.bit.day18;

import java.text.DateFormat;

public class Ex02 {
	public static void main(String[] args) {
		//주민번호확인
		java.util.Scanner sc = null;
		sc =new java.util.Scanner(System.in);
		String msg = null;
		int age = 1;
		char gender = '#';
		while(true){
			System.out.println("주민번호>>");
			msg = sc.nextLine();
			if(msg.length()!=14){
				System.out.println("입력을 다시확인하세요");
				continue;
			}
			if(msg.charAt(6) != '-'){
				System.out.println("입력을 다시확인하세요");
				continue;
			}
			
			char[] origin = {'0','1','2','3','4','5','6','7','8','9'};
			char[] target = {'영','일','이','삼','사','오','육','칠','팔','구'};
			for(int i = 0; i <msg.length(); i++){
				if(i==6){continue;};
				if(!Character.isDigit(msg.charAt(i))){
					for (int j = 0; j <target.length; j++){
						if(msg.charAt(i)==target[j]){
							String before = msg.substring(0,i);
							String after = msg.substring(i+1);
							msg = before + origin[j] + after;
						}
					}
				}
			}
			boolean boo = false;
			for(int i = 0; i <msg.length(); i++){
				if(i==6){continue;}
				char temp = msg.charAt(i);
				if(!Character.isDigit(temp)){
					System.out.println("입력을 다시확인하세요");
					boo = true;
					break;
				}
			}
			if(boo){continue;}
			
			int year = Integer.parseInt(msg.substring(0,2));
			java.util.Date now = new java.util.Date();
			DateFormat now2 = java.text.DateFormat.getInstance();
			String result = now2.format(now);
			int nowYear = Integer.parseInt(result.substring(0, 2));
			gender = msg.charAt(7);
	
			
			if(gender == '1'||gender =='2'){
				age = (2000+nowYear)-(year+1900)+1;
			}else{
				age = (2000+nowYear)-(year+2000)+1;
			}
			if(gender == '1' || gender =='3'){
				gender ='남';
			}else if(gender == '2'||gender =='4'){
				gender ='여';
			}
			break;
		}
		System.out.println("당신은"+age+"세"+gender+"성입니다");		
	}
}
