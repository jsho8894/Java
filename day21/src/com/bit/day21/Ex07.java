package com.bit.day21;

import java.io.File;

public class Ex07 {
	public static void main(String[] args) {
		String path = "test\\ex";
		File file = new File(path);
//		file.mkdir();//디렉토리 생성
//		file.delete();//삭제
//		boolean result = file.delete();
//		System.out.println(result);
		file.mkdirs();
		
	}
}
