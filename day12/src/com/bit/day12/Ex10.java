package com.bit.day12;

public class Ex10 {
	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);//java.util���� Scanner�� ������ ����մϴ�.
		String msg = null;//msg�� ���� �������� �־��ݴϴ�.
		
		
		
		//msg="951031-1124567";
		while(true){//while start
			System.out.println("�ֹι�ȣ �Է�");
			msg = sc.nextLine();//�Է�
			if(msg.length() !=14){
				System.out.println("�ڸ����� �ٽ� Ȯ���ϼ���");
				continue;
			}
			else if(msg.charAt(6)!='-'){
				System.out.println("�Է������� �ٽ�Ȯ�����ּ��� 000000-0000000");
				continue;
			}
			
			boolean suCheck=false;
			for(int i= 0; i<msg.length(); i++){
				if(i==6){continue;}//"-" �� ���� ������ �Ѿ�ݴϴ�.
				if(!(msg.charAt(i)>='0' && msg.charAt(i)<='9')){
					suCheck= true;
				}
			}
			
			if(suCheck){continue;}
			char year1 = msg.charAt(0);//'0'
			char year2 = msg.charAt(1);//'9'
			int year = (year1-'0')*10+(year2-'0')*1;

			char gender = msg.charAt(7);
			if(gender == '3'||gender=='4'){
				System.out.println("�����"+(2020-(2000+year)+1)+"��");
			}else if(gender == '1'||gender=='2'){
				System.out.println("�����"+(2020-(1900+year)+1)+"��");
			}
			if(gender == '1'||gender=='3'){
				System.out.println("�����Դϴ�");
			}else if(gender == '2'||gender=='4'){
				System.out.println("�����Դϴ�");
			}
			break;
		}//while end
	}
}
