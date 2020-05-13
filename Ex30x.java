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
			System.out.println("1.가위 2.바위 3보 0.종료>>");
			int user = sc.nextInt();
			if(user == 1)//가위
			{
				my = "가위";
				if(cpu == 1)
				{
					pc="가위";
					drow += 1;
					result = "비겼";
				}
				else if(cpu == 2)
				{
					pc="바위";
					lose += 1;
					result = "졌";
				}
				else if(cpu == 3)
				{
					pc="보";
					win += 1;
					result = "이겼";
				}
				
			}

			if(user == 2)//바위
			{
				my = "바위";
				if(cpu == 1)
				{
					pc="가위";
					drow += 1;
					result = "비겼";
				}
				else if(cpu == 2)
				{
					pc="바위";
					lose += 1;
					result = "졌";
				}
				else if(cpu == 3)
				{
					pc="보";
					win += 1;
					result = "이겼";
				}
			}

			if(user == 3)//보
			{
				my = "보";
				if(cpu == 1)
				{
					pc="가위";
					drow += 1;
					result = "비겼";
				}
				else if(cpu == 2)
				{
					pc="바위";
					lose += 1;
					result = "졌";
				}
				else if(cpu == 3)
				{
					pc="보";
					win += 1;
					result = "이겼";
				}
			}
			if(user == 0)//종료
			{
				System.out.println("당신은"+sum+"전"+win+"승"+drow+"무"+lose+"패");
				return;
			}
			System.out.println("당신:"+my+"컴퓨터:"+pc);
			System.out.println(result+"습니다\n");
			sum = i;
			i++
		}
		
		System.out.println("당신은"+sum+"전"+win+"승"+drow+"무"+lose+"패");
		
	}
}