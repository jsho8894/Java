package com.bit.day26;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex02 {

	public static void main(String[] args) {
//		File file = new File("data1.bin");
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("data1.bin");
			ois = new ObjectInputStream(fis);
			
		 	Student stu = (Student)ois.readObject();
//		 	stu = (Student)ois.readObject();
		 	stu.show();
		 	System.out.println("학번:"+stu.num);
		 	System.out.println("이름:"+stu.name);
		 	System.out.println("국어:"+stu.kor);
		 	System.out.println("영어:"+stu.eng);
//		 	System.out.println("수학:"+stu.math);
		 	System.out.println(stu);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(ois!=null)ois.close();
				if(fis!=null)fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}		
	}
}
