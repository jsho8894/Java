class Ex20{
	public static void main(String[] args){
		/*String input1;
		input1=args[0];
		System.out.println("result1>"+ input1);
		*/
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("���ڿ� �Է�>");
		String input2 = sc.nextLine();
		System.out.println("result2>"+ input2);


		System.out.print("���� �Է�>");
		int su = sc.nextInt();
		System.out.println("result3>"+ (su+1));
	}
}