package com.bit.day07;

public class Ex01{//�޼���
//1.���� �޼���,Ŭ�����޼���,static�޼���...
//2.�ν��Ͻ� �޼���,non-static �޼���....
	public void func01(){//���� �ٷ� ȣ���ϸ� ������ ���ɴϴ�
		System.out.println("non-static method...");
		System.out.println("�ν��Ͻ� �޼���");
	}

	public static void func02(){//�ν��Ͻ� �޼���� Ŭ���� �޼���� ���� �����ε��� �Ҽ� �����ϴ�.
		System.out.println("static �޼���");
		System.out.println("Ŭ���� �޼���");
		System.out.println("���� �޼���");
	}

	
	public static void main(String[] args){
		func02();
		System.out.println("-----------------------------------------------");
		//func01()//���� �ٷ� ȣ���ϸ� ������ ���ɴϴ�
		Ex01 me = new Ex01();//Ŭ������ �������� = new Ŭ������();
		me.func01();//�̷������� ���������� �����ؾ����� ����� �����մϴ�.
		System.out.println("-----------------------------------------------");
		me.func02();//������ ������ �ν��Ͻ����� static���� �˼��� ���� ������� �ʴ°��� ��õ�մϴ�.
	}
}