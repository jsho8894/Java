package com.bit.day13;

public class Ex08 {
	public static void main(String[] args) {	
		//학생 성적 관리 프로그램(ver 0.1.0)
		//문자열 이용
		//1.보기 2.입력 3.수정 4.삭제 0.종료
		//학번 국어 영어 수학 합계 평균
		//1번입력시 국어 영어 수학 합계 평균 표시
		//2번 입력시 국어 영어 수학을 입력 가능하도록
		//3번 학번입력시 국어 영우 수학을 재입력
		//4번 삭제시 학번만 입력
		//StringBuffer sn = new StringBuffer();
		
		java.util.Scanner sc = null;
		sc = new java.util.Scanner(System.in);
		
		String title = "학생성적 관리 프로그램(ver 0.1.0)";
		String menu = "1.보기 2.입력 3.수정 4.삭제 0.종료";
		//String input="";
		int input = 0;
		String data = "학번\t|국어\t|영어\t|수학\t|합계\t|평균";
		data+= "\n-------------------------------------------------------\n";
		System.out.println(title);
		System.out.println("\n-------------------------------------------------------\n");
		int cnt=0;
		while(true){		
			System.out.println(menu);
			//input = sc.nextLine();
			input = sc.nextInt();
			if(input == 0){break;}
			if(input == 1){
				System.out.println(data);
			}
			if(input ==2){
				cnt++;
				System.out.println("국어");
				int kor = sc.nextInt();
				System.out.println("영어");
				int eng = sc.nextInt();
				System.out.println("수학");
				int math = sc.nextInt();
				int sum = kor+eng+math;
				double avg = 100*sum/3/100;
				data+= "\n"+cnt+"\t|"+kor+"\t|"+eng+"\t|"+math+"\t|"+sum+"\t|"+avg+"\t|";
			}
			if(input ==3){
				System.out.println("학번");
				int num = sc.nextInt();
				System.out.println("국어");
				int kor = sc.nextInt();
				System.out.println("영어");
				int eng = sc.nextInt();
				System.out.println("수학");
				int math = sc.nextInt();
				int sum = kor+eng+math;
				double avg = 100*sum/3/100;
				String msg= num +"\t|"+kor+"\t|"+eng+"\t|"+math+"\t|"+sum+"\t|"+avg+"\t|";
				
				int idx = data.indexOf("\n"+num);//개행을 찾아 숫자를 찾아옵니다.
				String data1 = data.substring(0,idx+1);
				String data2 = data.substring(data.indexOf("\n",idx+1));
				data = data1+msg+data2;
			}
			if(input ==4){
				System.out.println("학번");
				int num = sc.nextInt();
				
				int idx = data.indexOf("\n"+num);//개행을 찾아 숫자를 찾아옵니다.
				String data1 = data.substring(0,idx+1);
				String data2 = data.substring(data.indexOf("\n",idx+1));
				data = data1+data2;
			}
		}
		System.out.println("이용해 주셔서 감사합니다.");
	}
}
