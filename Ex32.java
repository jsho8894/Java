class Ex32{//Ŭ���� �޼ҵ�

	public static void func01(){
		System.out.println("01����� �����մϴ�");
	}
	public static void func02(){
		int a = 1234;
		System.out.println("a="+a);
	}
	public static void func03(int a){ //(int a)�ȿ� �ִ� a�� ���ο� int a�� �����ѰͰ� �����ϴ�.
		a = 9999;
		func02();
		System.out.println("���޹��� ������:"+a);
	}
	public static void func04(int a , int b){ 
		int c = a + b;
		System.out.println(a + "+" + b + "=" + c);
	}

	public static void main(String[] args){
		int a = 1111;
		
		System.out.println("���α׷� ����"+a);
		
		
		func03(1234);
		//func04(2,3);
				
		System.out.println("���α׷� ����"+a);
	}
}
