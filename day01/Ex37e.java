class Ex37e{

	public static void main(String[] args){
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("\n\n계산기(ver 0.0.1)");
		System.out.println("---------------------------\n\n");
		int su1=0;
		int su2=0;
		int su3=0;
		while(true){
			System.out.print("숫자 1입력:");	
			int num1 = sc.nextInt();
			System.out.print("숫자 2입력:");
			int num2 = sc.nextInt();
			System.out.print("1.＋ 2.- 3.× 4.÷>>");
			int op = sc.nextInt()-1;
			if(op == 0){
				add(num1,num2);
			}
			if(op == 1){
				sub(num1,num2);
			}	
			if(op == 2){
				mul(num1,num2);
			}
			if(op == 3){
				div(num1,num2);
			}
			System.out.print("1.계속 0.종료>>");
			int op2 = sc.nextInt();
			if(Eop2 == 0){
				return;
			}
			System.out.println("---------------------------\n\n");
		}
	}		
}