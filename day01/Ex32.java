class Ex32{//클래스 메소드

	public static void func01(){
		System.out.println("01기능을 실행합니다");
	}
	public static void func02(){
		int a = 1234;
		System.out.println("a="+a);
	}
	public static void func03(int a){ //(int a)안에 있는 a는 내부에 int a를 선언한것과 같습니다.
		a = 9999;
		func02();
		System.out.println("전달받은 데이터:"+a);
	}
	public static void func04(int a , int b){ 
		int c = a + b;
		System.out.println(a + "+" + b + "=" + c);
	}

	public static void main(String[] args){
		int a = 1111;
		
		System.out.println("프로그램 시작"+a);
		
		
		func03(1234);
		//func04(2,3);
				
		System.out.println("프로그램 종료"+a);
	}
}
