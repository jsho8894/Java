package com.bit.day12;

public class Ex13 {
	public static void main(String[] args) {
		//String 클래스
		String msg1 = "java";
		String msg2 = "Web";
		String msg3 = msg1.concat(msg2);//두가지 이상의 문자열을 붙일수 있으며
		System.out.println(msg3);//javaWeb
		
		String msg4 = "JavaWebSpring";
		
		String msg5 = msg4.substring(4);//문자를 잘라 자신이 지정한범위를 보여줄수있습니다
		String msg6 = msg4.substring(4,7);
		String msg7 = msg4.substring(0,4);
		String msg8 = msg4.substring(4,msg4.length());
		String msg12 = msg4.replace("Java", "");
		
		String msg9 = msg4.replace("web","DB");
		String msg10 = msg4.replace("Web", "");
		String msg11 = msg4.replace("W", "w");
		
		
		char ch = msg4.charAt(0);//인덱스에 해당하는 문자
		int idx = msg4.indexOf('W');//문자에 해당하는 인덱스
		idx=msg4.indexOf("Web");
		idx=msg4.indexOf('a',2);
		String msg13 = msg4.substring(0,msg4.indexOf("Web"));
		String msg14 = msg4.substring(msg4.indexOf("web")+"web".length());
		String msg15 = msg4.replace("a", "A");
		System.out.println(msg13+"DB"+msg14);
		
	}
}
