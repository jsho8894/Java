package com.bit.day25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Ex11 {
	
	public static void main(String[] args) {
		String path = "data1.bin";
		File file = new File(path);
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			com.bit.day26.Student obj = (com.bit.day26.Student) ois.readObject(); 
			System.out.println(obj);
			
//			int su =-1;
//			while((su = fis.read()) != -1){
//				System.out.println(Integer.toHexString(su));
//			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}finally{
			try {
				if(ois != null)ois.close();
				if(fis != null)fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}
}
