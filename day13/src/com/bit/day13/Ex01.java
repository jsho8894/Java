package com.bit.day13;

public class Ex01 {
	public static void main(String[] args) {
		String msg1 = new String("JavaWebFramework");
		StringBuffer sb1 = new StringBuffer("JavaWebFramework");
		//StringBuffer sb2 = "";
		StringBuilder sb3 = new StringBuilder(sb1);//문자열 관련해서 들어갑니다.
		StringBuffer sb4 = new StringBuffer(10);
		System.out.println(sb4);
		
		System.out.println(msg1.length());
		System.out.println(sb1.length());
		
		//입력수정삭제조회 CRUD
		StringBuffer sb5 = new StringBuffer("Java");
		StringBuffer sb6 = new StringBuffer("web");
		//StringBuffer sb7 = sb5 + sb6;
		StringBuffer sb7 = sb5.append(sb6);
		//String msg2 = "sb7="+sb7;
		System.out.println("sb7="+sb7);
		System.out.println("sb5="+sb5);
		System.out.println("sb6="+sb6);
		System.out.println(sb5 == sb7);
		
		String msg2 = "java";
		String msg3 = "web";
		String msg4 = msg2 + msg3;
		System.out.println("String msg4="+msg4);
		System.out.println("String msg2="+msg2);
		System.out.println("String msg3="+msg3);
		sb5.append("Framework");
		System.out.println(sb5);//JavawebFramework
		sb5.delete(4, 7);//원하는 범위의 글자를 지워줍니다.
		System.out.println(sb5);//JavaFramework
		sb5.insert(4, "DB");//원하는 범위의 글자를 삽입하여줍니다
		System.out.println(sb5);//JavaDBFramework
		sb5.insert(sb5.length(), "Web");
		System.out.println(sb5);//JavaDBFramework
		sb5.replace(4, 6, "Database");//지우고 다시넣어줍니다
		System.out.println(sb5);//JavaDatabaseFramework
				
	}
}
