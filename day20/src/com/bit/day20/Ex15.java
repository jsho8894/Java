package com.bit.day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Ex15 {
	private static class Student{
		int num;
		String name;
		int kor,eng,math;
		
		int tot(){
			return kor+eng+math;
		}
		double avg(){
			return tot()*100/3/100.0;
		}
	}
	public static void main(String[] args) {
		//�л����� ���� ���α׷�(ver0.2.0)
		//�ڷᱸ��Ȱ��
		//�޴� 1.���� 2.�Է� 3.���� 4.���� 0.����>>>
		//�й� �̸� ���� ���� ���� �հ� ���
		
		HashMap<Object,Object> stumap = new HashMap<>();
			
		Scanner sc = new Scanner(System.in);
		String title = "�л����� ���� ���α׷�(ver0.2.0)";
		System.out.println(title);
		String menu = "1.���� 2.�Է� 3.���� 4.���� 0.����";
		String input = null;
		
		for(int i = 0; i <title.length(); i++){
			System.out.print("--");
		}
		System.out.println("\n");
		
		while(true){
			System.out.println(menu);
			input=sc.nextLine();
			if(input.equals("0")){break;}
			else if(input.equals("2")){
				Student stu = null;
				stu = new Student();
				System.out.print("�й�> ");
				stu.num = Integer.parseInt(sc.nextLine());
				System.out.print("�̸�> ");
				stu.name = sc.nextLine();
				System.out.print("����> ");
				stu.kor = Integer.parseInt(sc.nextLine());
				System.out.print("����> ");
				stu.eng = Integer.parseInt(sc.nextLine());
				System.out.print("����> ");
				stu.math = Integer.parseInt(sc.nextLine());
				stumap.put(stu.num, stu.name+"\t"+stu.kor+"\t"+stu.eng+"\t"+stu.math);
			}else if(input.equals("1")){
				Set<Object> keys = stumap.keySet();
				Iterator<Object> ite = keys.iterator();
				while(ite.hasNext()){
					Object key = ite.next();
					System.out.println(key+"\t"+stumap.get(key));			
				}
			}
		}
		System.out.println("�̿����ּż� �����մϴ�");
	}
}
