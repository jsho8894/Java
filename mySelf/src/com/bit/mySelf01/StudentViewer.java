package com.bit.mySelf01;

import java.util.Scanner;

//UI
//�츮�� ���� ������� �츮�� ����� ����ϴ°� ���������� �ǰ�
//���� �ű⿡ html�ڵ带 �����ְų� �ƴϸ� �ƿ� ����� Ŭ���� �������� �ֽ��ϴ�
//������ �츮�� ���� �ȹ�����Ƿ� ���⼭ main�޼ҵ带 �־��ݴϴ�.
public class StudentViewer {
	public 	StudentVO setInformation(Scanner scanner){
		StudentVO s = new StudentVO();
		System.out.print("�л��� �̸�: ");
		s.setName(scanner.nextLine());
		System.out.print("�л��� ��������: ");
		s.setKorean(scanner.nextInt());
		System.out.print("�л��� ��������: ");
		s.setEnglish(scanner.nextInt());
		System.out.print("�л��� ��������: ");
		s.setMath(scanner.nextInt());
		return s;
	}
}
//�̷��� �����͸� ��� Ʋ(��),UI(��),���� ��Ʈ�� �ϴ� ��Ʈ�ѷ��� �и��ؼ� 
//���α׷��� ����� ������ MVC���� �̶���մϴ�.

