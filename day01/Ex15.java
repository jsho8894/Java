class Ex15{
	public static void main(String[] args){
		float kor=94;
		float eng=80;
		float math=77;
		float add = kor+eng+math ;
		float hak = add/3;

		System.out.println("�������� ���α׷�(ver 0.0.1)");
		System.out.println("-----------------------------------------");
		System.out.println("����"+(int)kor);
		System.out.println("����"+(int)eng);
		System.out.println("����"+(int)math);
		System.out.println("-----------------------------------------");
		System.out.println("�հ�"+(int)add);
		System.out.println("-----------------------------------------");
		System.out.println("���" + String.format("%.2f", hak));
		System.out.println("-----------------------------------------");		
		if(hak >= 90)
		{
			System.out.println("A�Դϴ�");
		}else if(hak >= 80)
		{
			System.out.println("B�Դϴ�");
		}else if(hak >= 70)
		{
			System.out.println("C�Դϴ�");
		}else if(hak >= 60)
		{
			System.out.println("D�Դϴ�");
		}
		else
		{
			System.out.println("F�Դϴ�");
		}
	}		
}