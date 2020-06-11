package com.bit.mySelf01;

import java.util.Scanner;

//UI
//우리가 웹을 배웠으면 우리의 출력을 담당하는건 웹페이지가 되고
//뷰어는 거기에 html코드를 보내주거나 아니면 아예 뷰어라는 클래슥 없을떄도 있습니다
//하지만 우리는 웹을 안배웠으므로 여기서 main메소드를 넣어줍니다.
public class StudentViewer {
	public 	StudentVO setInformation(Scanner scanner){
		StudentVO s = new StudentVO();
		System.out.print("학생의 이름: ");
		s.setName(scanner.nextLine());
		System.out.print("학생의 국어점수: ");
		s.setKorean(scanner.nextInt());
		System.out.print("학생의 영어점수: ");
		s.setEnglish(scanner.nextInt());
		System.out.print("학생의 수학점수: ");
		s.setMath(scanner.nextInt());
		return s;
	}
}
//이렇게 데이터를 담는 틀(모델),UI(뷰),모델을 컨트롤 하는 컨트롤러로 분리해서 
//프로그램을 만드는 패턴을 MVC패턴 이라고합니다.

