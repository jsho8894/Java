package com.bit.day24;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex07 {

	public static void main(String[] args) {
		String path = "data.bin";
		String path2 = "data2.bin";
		File src = new File(path);
		File target = new File(path2);
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		byte[] buf = new byte[8];
		try {
			fis= new FileInputStream(src);
			fos = new FileOutputStream(target);
			
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);			
			while(true){
				int su = bis.read(buf);
				if(su == -1){break;}
				bos.write(buf,0,su);
			}
			bos.flush();//버퍼의 참과 상관없이 작성
			System.out.println("복사완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {//만약 close를 할때는 생성한 역순으로 닫아줍니다.
				if(bos!=null){bos.close();}
				if(bis!=null){bis.close();}
				if(fos!=null){fos.close();}
				if(fis!=null){fis.close();}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
