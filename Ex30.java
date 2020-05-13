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
			System.out.println("1.가위 2.바위 3보 0.종료>>");
			int user = sc.nextInt();
			if(user == 1)//가위
			{
				if(cpu == 1)
				{
					System.out.println("당신:가위"+"컴퓨터:가위");
					System.out.println("비겼습니다");
					drow += 1;
				}
				else if(cpu == 2)
				{
					System.out.println("당신:가위"+"컴퓨터:바위");
					System.out.println("졌습니다");
					lose += 1;
				}
				else if(cpu == 3)
				{
					System.out.println("당신:가위"+"컴퓨터:보");
					System.out.println("이겼습니다");
					win += 1;
				}
				
			}

			if(user == 2)//바위
			{
				if(cpu == 1)
				{
					System.out.println("당신:바위"+"컴퓨터:가위");
					System.out.println("이겼습니다");
					win += 1;
				}
				else if(cpu == 2)
				{
					System.out.println("당신:바위"+"컴퓨터:바위");
					System.out.println("비겼습니다");
					drow += 1;
				}
				else if(cpu == 3)
				{
					System.out.println("당신:바위"+"컴퓨터:보");
					System.out.println("졌습니다");
					lose += 1;
				}
			}

			if(user == 3)//보
			{
				if(cpu == 1)
				{
					System.out.println("당신:보"+"컴퓨터:가위");
					System.out.println("졌습니다");
					lose += 1;
				}
				else if(cpu == 2)
				{
					System.out.println("당신:보"+"컴퓨터:바위");
					System.out.println("이겼습니다");
					win += 1;
				}
				else if(cpu == 3)
				{
					System.out.println("당신:보"+"컴퓨터:보");
					System.out.println("비겼습니다");
					drow += 1;
				}
			}
			if(user == 0)//종료
			{
				System.out.println("당신은"+sum+"전"+win+"승"+drow+"무"+lose+"패");
				return;
			}
			sum = i;
		}
		System.out.println("당신은"+sum+"전"+win+"승"+drow+"무"+lose+"패");
		
	}
}