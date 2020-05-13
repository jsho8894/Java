class Ex35{//오버로딩
	public static void main(String[] args){
		func01("문자열");
		func01();
		func01(5);
		func01(5,3);
	}

	public static void func01(String msg){
		System.out.println(">>>"+msg);
	}
	public static void func01(){
		System.out.println("func01()... run...");
	}
	public static void func01(int a){//메소드의 이름은 중복이 불가능 하지만 타입,갯수가 다를경우 사용이 가능합니다. 이런경우를 매소드의 오버로드라고 합니다.
		System.out.println(a+"param func01()...run...");
	}
	public static void func01(int a, int b){
		System.out.println(a+"param,"+b+"param func01()...run...");
	}

}