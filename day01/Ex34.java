class Ex34{
	public static void main(String[] args){
		int su = func01();//해당 값이 있으면 자료형
		func02();//해당 값이 없다면 void
		
		if(su>5){//if문이 있을경우 return되면 뒤의 코드가 있어도 실행할수도 있어 오류가 나오지 않지만 true일 경우 확정되므로 오류가 발생합니다.
			return;
		}
		//return; 만일 여기서 return을 할경우 뒤의 코드가 있는데 반환하여 밑의 코드를 실행하지 않기 떄문에 오류가 나옵니다.
		System.out.println("su="+su);
		
	//System.exit(1); 이렇게 할시 가상머신쪽은 종료가 되지않아 오류가 나옵니다.
	}

	public static void func02(){
		System.out.println("void method run...");
		return;//컴파일 과정에서 생성되므로 생략가능
	}

	public static int func01(){
		System.out.println("func01 method run");
		int a=3;
		int b=2;
		int c= a+b;
		
		return c;//만일 return을 할때 void가 아니라면 명시적으로 자료형에 맞추어 반환해주어야 합니다 예)return 0;
	}

}