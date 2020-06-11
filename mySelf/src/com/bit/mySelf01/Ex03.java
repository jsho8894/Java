package com.bit.mySelf01;

import java.util.Scanner;
import java.util.ArrayList;

public class Ex03 {
	public static void main(String[] args) {
		ArrayList<StudentVO> list = new ArrayList<StudentVO>();
		Scanner scanner = new Scanner(System.in);
		StudentController controller = new StudentController(list);
		StudentViewer Viewer = new StudentViewer();
		while (true) {
			System.out.println("��Ʈ����б� ���� ����� ���α׷�");
			System.out.println("1.�Է� 2.��� 3.���� 4.���� 5.����");
			int choice = scanner.nextInt();
			scanner.nextLine();
			if (choice == 1) {
				// �Է��Ҷ��� ��ü�� ���� �������
				// �׸��� �� ��ü�� ����Ʈ�� �߰��ϸ� �������� �ҷ��ü� �ִ�.
				StudentVO s = Viewer.setInformation(scanner);
				controller.add(s);
			} else if (choice == 2) {
				for (StudentVO s : list) {
					System.out.println(s);
				}
			} else if (choice == 3) {
				if(list.size() == 0){
					System.out.println("���� �ƹ��͵� �����ϴ�");
				}else{
					for (StudentVO s : list) {
						System.out.println(s);
	
					}
					System.out.println("������ �й��� �������ּ���: ");
					StudentVO s = new StudentVO();
					s.setId(scanner.nextInt());
					while (controller.findbyId(s) == null) {
						System.out.println("�߸��� �й��Դϴ�.");
						System.out.println("������ �й��� �������ּ���: ");
						s.setId(scanner.nextInt());
					}
					scanner.nextLine();
					
					// ������ ��� �ΰ������
					// 1�ش� �ε����� ����ְ� �����ִ��� ����
					// 2 ��� ����Ʈ ��()�� ����ϴ¹��
					// ������ ���� ����� ������ �ε����� �ʿ��ϴ� �̸� �޾ƵӴϴ�.
					s = Viewer.setInformation(scanner);
					controller.set(s);
				}
			} else if (choice == 4) {
				// ���� ����
				if(list.size() == 0){
					System.out.println("���� �ƹ��͵� �����ϴ�");
				}else{
					for (StudentVO s : list) {
						System.out.println(s);
	
					}
					System.out.println("������ �й��� �������ּ���: ");
					StudentVO s = new StudentVO();
					s.setId(scanner.nextInt());
					scanner.nextLine();
					while (controller.findbyId(s) == null) {
						System.out.println("�߸��� �й��Դϴ�.");
						System.out.println("������ �й��� �������ּ���: ");
						s.setId(scanner.nextInt());
					}
					scanner.nextLine();
					controller.remove(s);
				}
			} else if (choice == 5) {
				System.out.println("������ּż� �����մϴ�");
				break;
			}
		}
	}
}
