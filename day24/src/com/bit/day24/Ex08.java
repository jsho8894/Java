package com.bit.day24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex08 {

	public static void main(String[] args) {
		String path = "data.bin";
		File file = new File(path);
		byte[] buf = new byte[13];
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(file);
			fis = new FileInputStream(file);
			fos.write("문자열을 출력합니다.".getBytes());
			while(true){
				int su = fis.read(buf);
				if(su==-1){break;}
				System.out.println(new String(buf,0,su));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				if(fos!=null){fos.close();}
				if(fis!=null){fis.close();}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
}
