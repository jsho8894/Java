class Ex21{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;
		System.out.print("����>");
		kor = sc.nextInt();
		System.out.print("����>");
		eng = sc.nextInt();
		System.out.print("����>");
		math = sc.nextInt();

		String msg="";
		msg+="\n�������� ���α׷�(ver 0.0.2)";			//msg = msg + "\n�������� ���α׷�(ver 0.0.2)"
		msg+="\n-----------------------------------------";	//msg = msg + "\n-----------------------------------------";
		msg+="\n����" + kor;					//msg = msg + "\n����" + kor;
		msg+="\n����" + eng;					//msg = msg + "\n����" + kor;
		msg+="\n����" + math;					//msg = msg + "\n����" + kor;
		msg+="\n-----------------------------------------";	//msg = msg + "\n-----------------------------------------";
		int sum = kor+eng+math ;				
		msg+="\n�հ�" + sum ;					//msg = msg + "\n����" + kor;
		msg+="\n-----------------------------------------";	//msg = msg + "\n-----------------------------------------";
		double avg = sum * 100/3/100.0;				
		msg+="\n���"+ avg;					//msg = msg + "\n���"+ avg;
		msg+="\n-----------------------------------------";	//msg = msg + "\n-----------------------------------------";
		
		char grade = 'F';
		int tmp=sum/30;
		switch(tmp){
			case 10:
			case 9:grade -=1 ;
			case 8:grade -=1;
			case 7:grade -=1;
			case 6:grade -=2;
			default:
		}

		msg+="\n����"+ grade;
		System.out.println(msg);
	}
}