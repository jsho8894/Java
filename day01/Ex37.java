class Ex37{

	public static void add(int a,int b){//������1
		System.out.println(a + "+" + b + "=" +(a+b));
	}
	public static void sub(int a,int b){//������2
		System.out.println(a + "-" + b + "=" + (a-b));
	}
	public static void mul(int a,int b){//������3
		System.out.println(a + "��" + b + "=" + (a*b));
	}
	public static void div(int a,int b){//������4
		System.out.println(a + "��" + b + "=" + (a/b));
	}

	public static void main(String[] args){
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("\n\n����(ver 0.0.1)");
		System.out.println("---------------------------\n\n");
		while(true){
			System.out.print("���� 1�Է�:");	
			int num1 = sc.nextInt();
			System.out.print("���� 2�Է�:");
			int num2 = sc.nextInt();
			System.out.print("1.�� 2.- 3.�� 4.��>>");
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
			System.out.print("1.��� 0.����>>");
			int op2 = sc.nextInt();
			if(Eop2 == 0){
				return;
			}
			System.out.println("---------------------------\n\n");
		}
	}		
}