package com.bit.day13;

public class Ex04 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("abcdefg");
		sb1.reverse();
		System.out.println(sb1);
		
//		char[] dest = new char[sb1.length()];
//		sb1.getChars(0, sb1.length(), dest, 0);
		char[] dest = {'#','#','#','#','#','#','#'};//new char[7];
		sb1.getChars(2, 5, dest, 2);
		//srcBegin이 - 문자열의 인덱스는 첫 번째 문자를 복사합니다.
		//는 srcEnd - 문자열에서 마지막 문자의 인덱스는 나중에 복사 할 수 있습니다.
		//DST - 대상 배열입니다.
		//dstBegin - 카피 대상 배열 개시 오프셋 (offset).
		
		for(int i=0; i<dest.length; i++){
			System.out.println(dest[i]);
		}
	}
}
