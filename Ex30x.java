class Ex30x{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);

		int win = 0;
		int drow = 0;
		int lose = 0;
		int sum = 0;
		String my = "a";
		String pc = "b";
		String result = "c";
		int i = 1;

		while( i<6; ){
			double random = Math.random();
			int cpu = (int)(random*(3))+1;
			System.out.println("1.���� 2.���� 3�� 0.����>>");
			int user = sc.nextInt();
			if(user == 1)//����
			{
				my = "����";
				if(cpu == 1)
				{
					pc="����";
					drow += 1;
					result = "���";
				}
				else if(cpu == 2)
				{
					pc="����";
					lose += 1;
					result = "��";
				}
				else if(cpu == 3)
				{
					pc="��";
					win += 1;
					result = "�̰�";
				}
				
			}

			if(user == 2)//����
			{
				my = "����";
				if(cpu == 1)
				{
					pc="����";
					drow += 1;
					result = "���";
				}
				else if(cpu == 2)
				{
					pc="����";
					lose += 1;
					result = "��";
				}
				else if(cpu == 3)
				{
					pc="��";
					win += 1;
					result = "�̰�";
				}
			}

			if(user == 3)//��
			{
				my = "��";
				if(cpu == 1)
				{
					pc="����";
					drow += 1;
					result = "���";
				}
				else if(cpu == 2)
				{
					pc="����";
					lose += 1;
					result = "��";
				}
				else if(cpu == 3)
				{
					pc="��";
					win += 1;
					result = "�̰�";
				}
			}
			if(user == 0)//����
			{
				System.out.println("�����"+sum+"��"+win+"��"+drow+"��"+lose+"��");
				return;
			}
			System.out.println("���:"+my+"��ǻ��:"+pc);
			System.out.println(result+"���ϴ�\n");
			sum = i;
			i++
		}
		
		System.out.println("�����"+sum+"��"+win+"��"+drow+"��"+lose+"��");
		
	}
}