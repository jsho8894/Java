class Ex20{
	public static void main(String[] args){
		/*String input1;
		input1=args[0];
		System.out.println("result1>"+ input1);
		*/
		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.print("문자열 입력>");
		String input2 = sc.nextLine();
		System.out.println("result2>"+ input2);


		System.out.print("숫자 입력>");
		int su = sc.nextInt();
		System.out.println("result3>"+ (su+1));
	}
}