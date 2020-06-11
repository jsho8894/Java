package com.bit.mySelf01;

import java.util.Scanner;

public class ScannerEx01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentVO s = new StudentVO();
		//StudentController controller = new StudentController(list);
		System.out.println("나이:");
		int age = scanner.nextInt();//버퍼메모리 
		System.out.println("이름:");
		//스캐럽 버그를 해결하기위해
		//scnner.nextLine()을 단독실행시켜줄떄
		//이클립스의 자동완성기능은
		//결과값이 없구나+나는 자동완성을 알파벳 순으로 추천해야지
		//이 두가지가 결합되면서
		//scnner.nextLine()이 아닌 scnner.hasNextLine()이 적히게 됩니다
		//하지만 scnner.hasNextLine()은 버퍼 메모리의 내용을 안가지고 오고단순히
		//다음이 있냐 없냐만 알려주기 때문에
		//버그를 해소하지 못합니다.
		//따라서 추천해주는 박스에서 nextLine()을 선택하고 엔터를 눌러야합니다.
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("이름: " + name + ", 나이: "+age);
		
	}
}
