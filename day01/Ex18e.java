class Ex18e{
	public static void main(String[] args){
		int kor=77;
		int eng=33;
		int math=66;
		int add = kor+eng+math ;
		double hak = add * 100/3/100.0;


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

		switch((int)hak/10){
			case 10:
			case 9:
			System.out.println("A");
			break;
			case 8:
			System.out.println("B");
			break;
			case 7:
			System.out.println("C");
			break;
			case 6:
			System.out.println("D");
			break;
			default:
			System.out.println("F");
		}
	}
}