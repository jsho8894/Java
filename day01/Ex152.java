class Ex152{
	public static void main(String[] args){
		int kor=77;
		int eng=33;
		int math=66;
		int add = kor+eng+math ;
		double avg = add * 100/3/100.0;

		System.out.println("�������� ���α׷�(ver 0.0.1)");
		System.out.println("-----------------------------------------");
		System.out.println("����" + kor);
		System.out.println("����" + eng);
		System.out.println("����" + math);
		System.out.println("-----------------------------------------");
		System.out.println("�հ�"+ add);
		System.out.println("-----------------------------------------");
		System.out.println("���" + avg);
		System.out.println("-----------------------------------------");		
		if(avg >= 90)
		{
			System.out.println("A�Դϴ�");
		}else if(avg >= 80)
		{
			System.out.println("B�Դϴ�");
		}else if(avg >= 70)
		{
			System.out.println("C�Դϴ�");
		}else if(avg >= 60)
		{
			System.out.println("D�Դϴ�");
		}
		else
		{
			System.out.println("F�Դϴ�");
		}
	}		
}