class Ex35{//�����ε�
	public static void main(String[] args){
		func01("���ڿ�");
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
	public static void func01(int a){//�޼ҵ��� �̸��� �ߺ��� �Ұ��� ������ Ÿ��,������ �ٸ���� ����� �����մϴ�. �̷���츦 �żҵ��� �����ε��� �մϴ�.
		System.out.println(a+"param func01()...run...");
	}
	public static void func01(int a, int b){
		System.out.println(a+"param,"+b+"param func01()...run...");
	}

}