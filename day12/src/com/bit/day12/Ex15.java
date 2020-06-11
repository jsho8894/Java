package com.bit.day12;

public class Ex15 {
	public static void main(String[] args) {
		String msg1 = "abcd";
		String msg2 = "abcd";
		String msg3 = "abc";
		String msg4 = "abcabadsfdsf";
		
		
		System.out.println(msg1.compareTo(msg2));//처음에는 서로의 문자의 크기를 비교한 만큼의 차를 구하고 모든 비교할
		System.out.println(msg1.compareTo(msg3));//문자의 크기가 같을때 길이를 비교하여줍니다
		System.out.println(msg1.compareTo(msg4));//3인이유는 abcd-abca는 +3입니다 이후 연산비교는 안하기때문에 이렇게 표현이 됩니다.
	}
}
