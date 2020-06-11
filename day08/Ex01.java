package day08;

public class Ex01{
	//Ŭ������ �������
	//1.�޼���
	//2.����
	
	public static int a;//Ŭ���� ����,��������....
	int b;	//�ɹ��ʵ�,�ν��Ͻ�����...
	public void func(){
		a++;
		System.out.println("a="+a);
	}

	public static void main(String[] args){
		Ex01 me = new Ex01();
		me.func();
	}
}