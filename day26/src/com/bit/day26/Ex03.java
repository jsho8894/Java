package com.bit.day26;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) {
		String msg = "���ڿ� �޽����� �ۼ��մϴ�\n12345\nABCDEFG";
		
		try(
		java.io.OutputStream os 
				= new FileOutputStream("text01.txt")
		){
			
			os.write(msg.getBytes());
//			os.flush();
			System.out.println("�ۼ��Ϸ�");
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
