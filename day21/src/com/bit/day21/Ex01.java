package com.bit.day21;

import java.io.IOException;

public class Ex01 {
	public static void main(String[] args) {
		//io
		//file
		//������
//		String path = "C:\\java\\Workspeas\\Java\\day21\\test01.txt";
//		String path = "C:\\java\\Workspeas\\Java\\day21\\src";
		//�����
//		String path = "test01.txt";
//		String path = "src";
		String path = ".";
//		String path = "..\\day21\\test01.txt";
		java.io.File file = new java.io.File(path);
		
		System.out.println("������ �����ϴ°�?"+file.exists());
		System.out.println("�����ΰ�?"+file.isFile());
		System.out.println("���丮�ΰ��ΰ�?"+file.isDirectory());
		System.out.println("�̸���?"+file.getName());
		System.out.println("location��?"+file.getPath());
		System.out.println("�ܼ� �����δ�?"+file.getAbsolutePath());
		try {
			System.out.println("�Ϲ� �����δ�?"+file.getCanonicalPath());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Path��?"+file.getParent());
		
		System.out.println("rwx r�б����?"+file.canRead());
		System.out.println("rwx w�������?"+file.canWrite());
		System.out.println("rwx x�������?"+file.canExecute());
		System.out.println("size?: "+file.length()+"byte");
		System.out.println("���������ð�?: "+new java.util.Date(file.lastModified()));
		
		String[] dirs = file.list();
		for(int i = 0; i <dirs.length; i++){
			System.out.println(dirs[i]);
		}
		

		
	}
}
