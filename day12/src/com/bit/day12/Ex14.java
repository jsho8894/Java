package com.bit.day12;

public class Ex14 {
	public static void main(String[] args) {
		String msg = "JavaWebFramework";
		String msg2 = "		java"		;
		int su = msg.indexOf("web");
		String st1 = msg.replace('z', 'Z');
		char ch = msg.charAt(0);
		boolean boo1 = msg.contains("web");
		boolean boo2 = msg.startsWith("ja");
		boolean boo3 = msg.endsWith("work");
		
		String st2 = msg.toLowerCase();//모든영문자를 소문자로
		String st3 = msg.toUpperCase();//모든영문자를 대문자로
		String st4 = msg2.trim();//앞뒤의 공백을 제거하여줍니다.
		int lang = msg2.length();
		boolean boo4 = msg2.isEmpty();
		System.out.println(st4);
	}
}
