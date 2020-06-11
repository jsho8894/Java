package com.bit.day26;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Ex01 {

	public static void main(String[] args) {
		//Object -needs ��ü ����ȭ Serializable
		//��ü ����ȭ�� ����� �ɹ� �ʵ�
		String path = "data1.bin";
		File file = new File(path);
		
		try {
			if(!file.exists())file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileOutputStream fos = null;
		ObjectOutputStream oos =null;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			
			Student stu = new Student(1,"ȫ�浿",80,80,80);			
			oos.writeObject(stu);
			stu.show();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(oos!=null)oos.close();
				if(fos!=null)fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
