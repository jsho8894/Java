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
			System.out.println("비트고등학교 성적 입출력 프로그램");
			System.out.println("1.입력 2.출력 3.수정 4.삭제 5.종료");
			int choice = scanner.nextInt();
			scanner.nextLine();
			if (choice == 1) {
				// 입력할때만 객체를 만들어서 사용하자
				// 그리고 그 객체를 리스트에 추가하면 언제든지 불러올수 있다.
				StudentVO s = Viewer.setInformation(scanner);
				controller.add(s);
			} else if (choice == 2) {
				for (StudentVO s : list) {
					System.out.println(s);
				}
			} else if (choice == 3) {
				if(list.size() == 0){
					System.out.println("아직 아무것도 없습니다");
				}else{
					for (StudentVO s : list) {
						System.out.println(s);
	
					}
					System.out.println("수정할 학번을 선택해주세요: ");
					StudentVO s = new StudentVO();
					s.setId(scanner.nextInt());
					while (controller.findbyId(s) == null) {
						System.out.println("잘못된 학번입니다.");
						System.out.println("수정할 학번을 선택해주세요: ");
						s.setId(scanner.nextInt());
					}
					scanner.nextLine();
					
					// 수정의 경우 두가지방법
					// 1해당 인덱스에 끼어넣고 원래있던걸 삭제
					// 2 어레이 리스트 셋()을 사용하는방법
					// 하지만 둘정 어느걸 쓰더라도 인덱스가 필요하니 미리 받아둡니다.
					s = Viewer.setInformation(scanner);
					controller.set(s);
				}
			} else if (choice == 4) {
				// 삭제 구현
				if(list.size() == 0){
					System.out.println("아직 아무것도 없습니다");
				}else{
					for (StudentVO s : list) {
						System.out.println(s);
	
					}
					System.out.println("삭제할 학번을 선택해주세요: ");
					StudentVO s = new StudentVO();
					s.setId(scanner.nextInt());
					scanner.nextLine();
					while (controller.findbyId(s) == null) {
						System.out.println("잘못된 학번입니다.");
						System.out.println("삭제할 학번을 선택해주세요: ");
						s.setId(scanner.nextInt());
					}
					scanner.nextLine();
					controller.remove(s);
				}
			} else if (choice == 5) {
				System.out.println("사용해주셔서 감사합니다");
				break;
			}
		}
	}
}
