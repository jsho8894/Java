package com.bit.day26;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		InputStream is = null;
		try {
			
			File file = new File("text01.txt");
//			is = new FileInputStream("text01.txt");
			Scanner sc = new Scanner("���\n���2");
			System.out.println(sc.nextLine());
			System.out.println(sc.nextLine());
			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
		}finally{
			try {
				if(is!=null)is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
