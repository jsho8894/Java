package com.bit.day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex06 {

	public static void main(String[] args) {
		
		String path = "data.bin";
		String path2 = "data2.bin";
		File file = new File(path);
		File file2 = new File(path2);
		if(file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		String msg = "abcdefg\n1234567890\n!@#$%^&*";
//		byte[] arr = msg.getBytes();
		byte[] buf = new byte[128];
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(file2);
			while(true){
				int su = fis.read(buf,0,buf.length);
//				System.out.println("�о�帰 ����:"+su);
//				int su =fis.read(buf);
				if(su==-1){break;}
				fos.write(buf,0,su);
			}
			System.out.println("����Ϸ�");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if(fos!=null){fos.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
