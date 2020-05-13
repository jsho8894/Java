class Ex16{ 
	public static void main(String[] args){
		//변수(선언&초기화)
		//자료형 변수명; //변수의 선언
		//변수명 = 초기값; //변수의 초기화
		int a = 1234; //변수의 선언과 초기화를 동시에
		System.out.println("a="+a);
		//자료형
		//숫자
		//바이트와 short한에서는 
		byte su1 = 127;
		short su2= 127;
		int su3= 2147483647;

		long su4= 2147483648L;
		//su4= (long)2147483648;//이것과 위의 변수는 같다고 생각할수 있지만 가져오는 방식이 다릅니다.
		
		//byte su5 = 1;
		//su1 = su5 + 2;//byte와 int의 연산으로 오류가 나옵니다.

		System.out.println("su1="+su1);
		System.out.println("su2="+su2);
		System.out.println("su3="+su3);
		System.out.println("su4="+su4);
		
		//숫자형(실수)
		float su11 = 3.141235f;
		double su12 = 3.141235;
		System.out.println("su11="+su11);
		System.out.println("su12="+su12);
	
		//문자형(char)
		char ch1;
		ch1 = 'A';
		System.out.println("ch1 =" + (int)ch1);
		System.out.println("65 =" + (char)65);
		System.out.println("66 =" + (char)66);
		System.out.println("67 =" + (char)67);

		//String 문자형 자료형
		String msg = "문자열";
		System.out.println(msg);

		//제어문-조건문-if
		//int su21;
		//int su22 = 2;
		//if(su22%2==0){
		//	su21 = 1234;
		//}
		//System.out.println("su21 =" + su21); 이렇게 사용시 변수를 선언만하고 값을 if안에 넣을시 만약 틀릴경우 값이 없기떄문에 오류로 처리됩니다.단

		int su21;
		int su22 = 2;
		if(su22%2==0){
			su21 = 1234;
		}else
		{
			su21 = 4321;
		}
		System.out.println("su21 =" + su21);//이렇게 else를 사용할시 값이 틀리더라도 다른값이 있으므로 오류가 나오지 않습니다. 하지만 이것은 그렇게 좋은 코드는 아닙니다.
		

		int su = 1;
		if(su == 0){
			System.out.println("0입니다");
		}else if(su<2){
			System.out.println("1입니다");
		}else if(su<3){
			System.out.println("2입니다");
		}


		if(su == 0){
			System.out.println("0입니다");
		}
		if(su!=0 && su<2){
			System.out.println("1입니다");
		}
		if(su!=0 && su<3){
			System.out.println("2입니다");
		}
	}
}