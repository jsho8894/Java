package com.bit.day14;

import com.sun.xml.internal.ws.api.pipe.NextAction;

public class Ex01 {
	public static void main(String[] args) {
		java.util.Scanner sc = null;
		sc = new java.util.Scanner(System.in);
		String msg = null;
		
		while(true){
			System.out.println("주민번호를 입력하여주세요");
			msg = sc.nextLine();
			if(msg.length() != 14 ){
				System.out.println("자릿수가 틀립니다.");
				continue;
			}else if(msg.charAt(6) !='-'){
				System.out.println("000000-0000000 형식으로 적어주세요");
				continue;
			}			
			boolean suCheck = false;
			for(int i= 0; i<msg.length(); i++){
				if(i == 6){continue;}
				if(!(msg.charAt(i)>='0' && msg.charAt(i)<='9')){
					suCheck = true;
				}
			}
			if(suCheck){continue;}
		}//while end
	}
}
