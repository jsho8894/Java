class Ex31{
	public static void main(String[] args){
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("\n���������� ����(ver0.0.2)");
		System.out.println("--------------------------------------------\n\n");
		int win = 0;
		int drow = 0;
		int lose = 0;
		int input =0;
		int com = 0; // 0~2
		boolean boo = true;
		
		while(boo){
			System.out.println("1.���� 2.���� 3.�� 0.����>>>");
			input = sc.nextInt()-1;
			String msg ="���:";

			if(input == 0){
				msg+="����";
			}else if(input == 1){
				msg+="����";
			}else if(input == 2){
				msg+="��";
			}
	
			msg+=",��ǻ��";
			com = (int)(Math.random()*3);
	
			if(com == 0){
				msg+="����";
			}else if(input == 1){
				msg+="����";
			}else if(input == 2){
				msg+="��";
			}
			
			if(input == -1){
				boo = false;
			}else{
	
				System.out.println(msg);	
		
				if(input == com){
					System.out.println("�����ϴ�.");
					drow++;
				}else if((input == 0 && com == 2)||(input == 1 && com == 0)||(input == 2 && com == 1)){
					System.out.println("����� �̰���ϴ�.");
					win++;
				}else{
					System.out.println("��ǻ�Ͱ� �̰���ϴ�.");
					lose++;
				}
			}
		}
		System.out.println("(����)"+win+"��"+drow+"��"+lose+"��");
	}
}