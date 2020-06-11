package com.bit.mySelf01;

public class StudentEx01 {
	public static void main(String[] args) {
		StudentVO[] arr = new StudentVO[0];
		StudentVO s = new StudentVO();
		s.setName("AAA");
		s.setKorean(50);
		s.setEnglish(51);
		s.setMath(50);
		System.out.println(arr.length);
		arr= StudentArrayUtil.add(arr,s);
		System.out.println(arr.length);
		System.out.println("S의 위치"+ StudentArrayUtil.indexOf(arr, s));
		StudentVO s2 = new StudentVO();
		s2.setName("bbb");
		s2.setKorean(50);
		s2.setEnglish(51);
		s2.setMath(50);
		
		StudentVO s3 = new StudentVO();
		s3.setName("ccc");
		s3.setKorean(50);
		s3.setEnglish(51);
		s3.setMath(50);
		
		StudentVO s4 = new StudentVO();
		s4.setName("ddd");
		s4.setKorean(50);
		s4.setEnglish(51);
		s4.setMath(50);
		
		StudentVO s5 = new StudentVO();
		s5.setName("eee");
		s5.setKorean(50);
		s5.setEnglish(51);
		s5.setMath(50);
		
		arr = StudentArrayUtil.add(arr, s2);
		arr = StudentArrayUtil.add(arr, s3);
		arr = StudentArrayUtil.add(arr, s4);
		arr = StudentArrayUtil.add(arr, s5);
		System.out.println("arr의 현재 크기:"+arr.length);
		arr = StudentArrayUtil.remove(arr, s4);
		System.out.println("arr의 현재 크기:"+arr.length);
	
		StudentVO s6 = new StudentVO();
		s6.setName("fff");
		s6.setKorean(50);
		s6.setEnglish(51);
		s6.setMath(50);
		
		System.out.println("S6의 인덱스"+ StudentArrayUtil.indexOf(arr, s6));
		System.out.println("arr의 현재 크기:"+arr.length);
		arr = StudentArrayUtil.remove(arr, s6);
		System.out.println("arr의 현재 크기:"+arr.length);
		
	}
}
