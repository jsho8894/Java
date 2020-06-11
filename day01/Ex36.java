class Ex36{//예외 상황
	public static void main(String[] args){
		func1(1234);//원래는 정수형 값으로표현은 불가능하지만 강제 형변환을 하기때문에 실행은 됩니다
	}
	public static void func1(double w){
		System.out.println("param :"+w);//이러한함수가 하나만 있을시 자신이 원하는 코드가 나오지 않을수 있기때문에 가능한 사용하지 않는것이 좋습니다.
	}
	/*public static void func1(int w){//이렇게 오버로딩을 했다면 지정된 자료형을 찾아 사용이 가능합니다.
		System.out.println("param :"+w);
	}*/
}