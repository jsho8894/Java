class Ex30e{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int win = 0;
		int drow = 0;
		int lose = 0;
		int sum = 0;
		int i = 1;
		while(i<6){
			double random = Math.random();
			int cpu = (int)(random*(3))+1;
			System.out.println("1.���� 2.���� 3�� 0.����>>");
			int user = sc.nextInt();
			switch(user){
				case 1: switch(cpu){
						case 1:System.out.println("���:����"+"/t��ǻ��:����"+"\n�����ϴ�");
						drow += 1;
						break;
						case 2:System.out.println("���:����"+"/t��ǻ��:����"+"\n�����ϴ�");
						lose += 1;
						break;
						case 3:System.out.println("���:����"+"/t��ǻ��:��"+"\n�̰���ϴ�");
						win += 1;
						break;
					}
				break;
				case 2: switch(cpu){
						case 1:System.out.println("���:����"+"/t��ǻ��:����"+"\n�̰���ϴ�");
						win += 1;
						break;
						case 2:System.out.println("���:����"+"/t��ǻ��:����"+"\n�����ϴ�");
						drow += 1;
						break;
						case 3:System.out.println("���:����"+"/t��ǻ��:��"+"\n�����ϴ�");
						lose += 1;
						break;
					}
				break;
				case 3: switch(cpu){
						case 1:System.out.println("���:��"+"/t��ǻ��:����"+"\n�����ϴ�");
						lose += 1;
						break;
						case 2:System.out.println("���:��"+"/t��ǻ��:����"+"\n�̰���ϴ�");
						win += 1;
						break;
						case 3:System.out.println("���:��"+"/t��ǻ��:��"+"\n�����ϴ�");
						drow += 1;
						break;
					}
				break;
				case 0:System.out.println("�����"+sum+"��"+win+"��"+drow+"��"+lose+"��");
				return;
			}
			sum = i;
			i++;
		}	
		System.out.println("�����"+sum+"��"+win+"��"+drow+"��"+lose+"��");
	}
}