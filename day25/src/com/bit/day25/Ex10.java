package com.bit.day25;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex10 {

	public static void main(String[] args) {
		String path = "data.bin";
		File file = new File(path);
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
				
		try {
			fis = new FileInputStream(file);
			
			String msg = (String) ois.readObject();
			ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
			
			System.out.println(msg);
			for(int i = 0; i<list.size(); i++){
				System.out.println(list.get(i));
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e){
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
