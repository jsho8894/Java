class Ex34{
	public static void main(String[] args){
		int su = func01();//�ش� ���� ������ �ڷ���
		func02();//�ش� ���� ���ٸ� void
		
		if(su>5){//if���� ������� return�Ǹ� ���� �ڵ尡 �־ �����Ҽ��� �־� ������ ������ ������ true�� ��� Ȯ���ǹǷ� ������ �߻��մϴ�.
			return;
		}
		//return; ���� ���⼭ return�� �Ұ�� ���� �ڵ尡 �ִµ� ��ȯ�Ͽ� ���� �ڵ带 �������� �ʱ� ������ ������ ���ɴϴ�.
		System.out.println("su="+su);
		
	//System.exit(1); �̷��� �ҽ� ����ӽ����� ���ᰡ �����ʾ� ������ ���ɴϴ�.
	}

	public static void func02(){
		System.out.println("void method run...");
		return;//������ �������� �����ǹǷ� ��������
	}

	public static int func01(){
		System.out.println("func01 method run");
		int a=3;
		int b=2;
		int c= a+b;
		
		return c;//���� return�� �Ҷ� void�� �ƴ϶�� ��������� �ڷ����� ���߾� ��ȯ���־�� �մϴ� ��)return 0;
	}

}