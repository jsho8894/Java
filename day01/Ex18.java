class Ex18{
	public static void main(String[] args){
		int kor=77;
		int eng=33;
		int math=66;
		int add = kor+eng+math ;
		String grade;
		double hak = add * 100/3/100.0;
		switch((add/3)/10){
			case 10:
			case 9:
			grade = "A";
			break;
			case 8:
			grade = "B";
			break;
			case 7:
			grade = "C";
			break;
			case 6:
			grade = "D";
			break;
			default:
			grade = "F";
		}

		System.out.println("�������� ���α׷�(ver 0.0.1)");
		System.out.println("-----------------------------------------");
		System.out.println("����" + kor);
		System.out.println("����" + eng);
		System.out.println("����" + math);
		System.out.println("-----------------------------------------");
		System.out.println("�հ�"+ add);
		System.out.println("-----------------------------------------");
		System.out.println("���" + hak);
		System.out.println("-----------------------------------------");		
		System.out.println(gread);
	}
}