class Ex30{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		/*double random = Math.random();
		int cpu = (int)(random*(3))+1;
		System.out.print("")*/
		int win = 0;
		int drow = 0;
		int lose = 0;
		int sum = 0;
		/*
			int cpu = (int)(random*(3))+1;
			while(com>2){
				com =(int)(Math.random()*10)
			}
		*/
		for(int i = 1; i<6; i++){
			double random = Math.random();
			int cpu = (int)(random*(3))+1;
			System.out.println("1.���� 2.���� 3�� 0.����>>");
			int user = sc.nextInt();
			if(user == 1)//����
			{
				if(cpu == 1)
				{
					System.out.println("���:����"+"��ǻ��:����");
					System.out.println("�����ϴ�");
					drow += 1;
				}
				else if(cpu == 2)
				{
					System.out.println("���:����"+"��ǻ��:����");
					System.out.println("�����ϴ�");
					lose += 1;
				}
				else if(cpu == 3)
				{
					System.out.println("���:����"+"��ǻ��:��");
					System.out.println("�̰���ϴ�");
					win += 1;
				}
				
			}

			if(user == 2)//����
			{
				if(cpu == 1)
				{
					System.out.println("���:����"+"��ǻ��:����");
					System.out.println("�̰���ϴ�");
					win += 1;
				}
				else if(cpu == 2)
				{
					System.out.println("���:����"+"��ǻ��:����");
					System.out.println("�����ϴ�");
					drow += 1;
				}
				else if(cpu == 3)
				{
					System.out.println("���:����"+"��ǻ��:��");
					System.out.println("�����ϴ�");
					lose += 1;
				}
			}

			if(user == 3)//��
			{
				if(cpu == 1)
				{
					System.out.println("���:��"+"��ǻ��:����");
					System.out.println("�����ϴ�");
					lose += 1;
				}
				else if(cpu == 2)
				{
					System.out.println("���:��"+"��ǻ��:����");
					System.out.println("�̰���ϴ�");
					win += 1;
				}
				else if(cpu == 3)
				{
					System.out.println("���:��"+"��ǻ��:��");
					System.out.println("�����ϴ�");
					drow += 1;
				}
			}
			if(user == 0)//����
			{
				System.out.println("�����"+sum+"��"+win+"��"+drow+"��"+lose+"��");
				return;
			}
			sum = i;
		}
		System.out.println("�����"+sum+"��"+win+"��"+drow+"��"+lose+"��");
		
	}
}