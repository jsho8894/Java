package com.bit.day12;

public class Ex10 {
	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);//java.util에서 Scanner을 가져와 사용합니다.
		String msg = null;//msg에 값을 공백으로 넣어줍니다.
		
		
		
		//msg="951031-1124567";
		while(true){//while start
			System.out.println("주민번호 입력");
			msg = sc.nextLine();//입력
			if(msg.length() !=14){
				System.out.println("자릿수를 다시 확인하세요");
				continue;
			}
			else if(msg.charAt(6)!='-'){
				System.out.println("입력패턴을 다시확인해주세요 000000-0000000");
				continue;
			}
			
			boolean suCheck=false;
			for(int i= 0; i<msg.length(); i++){
				if(i==6){continue;}//"-" 가 들어가기 때문에 넘어가줍니다.
				if(!(msg.charAt(i)>='0' && msg.charAt(i)<='9')){
					suCheck= true;
				}
			}
			
			if(suCheck){continue;}
			char year1 = msg.charAt(0);//'0'
			char year2 = msg.charAt(1);//'9'
			int year = (year1-'0')*10+(year2-'0')*1;

			char gender = msg.charAt(7);
			if(gender == '3'||gender=='4'){
				System.out.println("당신은"+(2020-(2000+year)+1)+"세");
			}else if(gender == '1'||gender=='2'){
				System.out.println("당신은"+(2020-(1900+year)+1)+"세");
			}
			if(gender == '1'||gender=='3'){
				System.out.println("남자입니다");
			}else if(gender == '2'||gender=='4'){
				System.out.println("여자입니다");
			}
			break;
		}//while end
	}
}
