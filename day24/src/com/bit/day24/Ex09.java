package com.bit.day24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex09 {

	public static void main(String[] args) {
		String path = "data.bin";
		File file = new File(path);
		String msg = "문자열 스트림을 통해\n파일에 작성합니다";
		char[] arr = msg.toCharArray();
		java.io.FileReader fr = null;
		java.io.FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			fw.write(msg);
//			for(int i = 0; i<arr.length; i++){
//				fw.write(arr[i]);
//			}
			fw.flush();
			fr = new FileReader(file);
			while(true){
				int su = fr.read();
				if(su == -1){break;}
				System.out.println((char)su);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try {
				if(fr!=null){fr.close();}
				if(fw!=null){fw.close();}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
