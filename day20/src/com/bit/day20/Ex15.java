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
		//학생성적 관리 프로그램(ver0.2.0)
		//자료구조활용
		//메뉴 1.보기 2.입력 3.수정 4.삭제 0.종료>>>
		//학번 이름 국어 영어 수학 합계 평균
		
		HashMap<Object,Object> stumap = new HashMap<>();
			
		Scanner sc = new Scanner(System.in);
		String title = "학생성적 관리 프로그램(ver0.2.0)";
		System.out.println(title);
		String menu = "1.보기 2.입력 3.수정 4.삭제 0.종료";
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
				System.out.print("학번> ");
				stu.num = Integer.parseInt(sc.nextLine());
				System.out.print("이름> ");
				stu.name = sc.nextLine();
				System.out.print("국어> ");
				stu.kor = Integer.parseInt(sc.nextLine());
				System.out.print("영어> ");
				stu.eng = Integer.parseInt(sc.nextLine());
				System.out.print("수학> ");
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
		System.out.println("이용해주셔서 감사합니다");
	}
}
