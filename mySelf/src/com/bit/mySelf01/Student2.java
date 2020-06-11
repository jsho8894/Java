package com.bit.mySelf01;

import java.util.Scanner;


public class Student2 {
	// 필드를 만들자
	String name;
	int korean;
	int english;
	int math;
	//메소드를 만들자
	public int calculateSum() {
		return korean + english + math;
	}

	public double calculateAverage() {
		return calculateSum() / 3.0;
	}

	public static void main(String[] args) {
		Student2 s = new Student2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생의 이름을 입력하세요:");
		s.name = scanner.nextLine();
		System.out.println("학생의 국어점수를 입력하세요");
		s.korean = scanner.nextInt();
		System.out.println("학생의 영어점수를 입력하세요");
		s.english = scanner.nextInt();
		System.out.println("학생의 수학점수를 입력하세요");
		s.math = scanner.nextInt();
		System.out.printf(
				"학생의 이름 %s\t국어 점수 %d\t 영어점수: %d\t 수학점수: %d\t 총점: %d\t평균: %.2f",
				s.name, s.korean, s.english, s.math, s.calculateSum(),
				s.calculateAverage());
		scanner.close();
	}
}
