package com.bit.mySelf01;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentVO s = new StudentVO();
		//StudentController controller = new StudentController(list);
		System.out.println("����:");
		int age = scanner.nextInt();//���۸޸� 
		System.out.println("�̸�:");
		//��ĳ�� ���׸� �ذ��ϱ�����
		//scnner.nextLine()�� �ܵ���������ً�
		//��Ŭ������ �ڵ��ϼ������
		//������� ������+���� �ڵ��ϼ��� ���ĺ� ������ ��õ�ؾ���
		//�� �ΰ����� ���յǸ鼭
		//scnner.nextLine()�� �ƴ� scnner.hasNextLine()�� ������ �˴ϴ�
		//������ scnner.hasNextLine()�� ���� �޸��� ������ �Ȱ����� ����ܼ���
		//������ �ֳ� ���ĸ� �˷��ֱ� ������
		//���׸� �ؼ����� ���մϴ�.
		//���� ��õ���ִ� �ڽ����� nextLine()�� �����ϰ� ���͸� �������մϴ�.
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("�̸�: " + name + ", ����: "+age);
		
	}
}
