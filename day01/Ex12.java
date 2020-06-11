class Ex12{
	public static void main(String[] args){
		//단항 논리 연산자
		boolean a;
		a = true;
		System.out.println(!a);
		System.out.println(!(3>5));
		//대입 연산자(=, +=, -=, *=, /= , %=)
		int b;
		b=100;		
		b+=2; //b= b+2;와 같습니다
		b*=2+2;//b=b*(2+2);와 같습니다.
		System.out.println(b);
	}
}