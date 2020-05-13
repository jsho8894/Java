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
			System.out.println("1.가위 2.바위 3보 0.종료>>");
			int user = sc.nextInt();
			switch(user){
				case 1: switch(cpu){
						case 1:System.out.println("당신:가위"+"/t컴퓨터:가위"+"\n비겼습니다");
						drow += 1;
						break;
						case 2:System.out.println("당신:가위"+"/t컴퓨터:바위"+"\n졌습니다");
						lose += 1;
						break;
						case 3:System.out.println("당신:가위"+"/t컴퓨터:보"+"\n이겼습니다");
						win += 1;
						break;
					}
				break;
				case 2: switch(cpu){
						case 1:System.out.println("당신:바위"+"/t컴퓨터:가위"+"\n이겼습니다");
						win += 1;
						break;
						case 2:System.out.println("당신:바위"+"/t컴퓨터:바위"+"\n비겼습니다");
						drow += 1;
						break;
						case 3:System.out.println("당신:바위"+"/t컴퓨터:보"+"\n졌습니다");
						lose += 1;
						break;
					}
				break;
				case 3: switch(cpu){
						case 1:System.out.println("당신:보"+"/t컴퓨터:가위"+"\n졌습니다");
						lose += 1;
						break;
						case 2:System.out.println("당신:보"+"/t컴퓨터:바위"+"\n이겼습니다");
						win += 1;
						break;
						case 3:System.out.println("당신:보"+"/t컴퓨터:보"+"\n비겼습니다");
						drow += 1;
						break;
					}
				break;
				case 0:System.out.println("당신은"+sum+"전"+win+"승"+drow+"무"+lose+"패");
				return;
			}
			sum = i;
			i++;
		}	
		System.out.println("당신은"+sum+"전"+win+"승"+drow+"무"+lose+"패");
	}
}