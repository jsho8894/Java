class Ex05{
	public static void main(String[] args){
		System.out.println((int)'\uac00');
		int a = 1234;
		double b;
		b=a;
		System.out.println("b="+b);

		a = 1234;
		b = 3.14;
		a=(int)b;
		System.out.println("a="+a);

		char c;
		c='a';
		c=65;
		System.out.println("c="+c);
	}
}
