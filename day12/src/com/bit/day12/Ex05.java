package com.bit.day12;

public class Ex05 {
	public static void main(String[] args) {
		String msg = "a";
		int[] arr = {1,2,3,4,5};
		try{
			int su = Integer.parseInt(msg);
			System.out.println(arr[su]);
		}
		catch(NumberFormatException e){//숫자열이 아닐시 오류를 잡을떄 사용합니다
			
		}
		catch (ArrayIndexOutOfBoundsException e){//배열의 유효하지 않은 인덱스 사용 예외 발생
			
		}
		catch (Exception e) {//예상치못한 오류를 잡을때 사용하는걸 추천합니다 java api를참고

		}
	}
}
