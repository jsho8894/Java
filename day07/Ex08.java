package com.bit.day07;

class Ex08{
	public static void main(String[] args){
		System.out.println("main start...");
		for(int i=0; i<11; i++){
			System.out.print("Ȯ��");
			if(i%2!=0){continue;}//��ŵ
			//if(i>2){break;}//break�� ������ �ڵ带 Ż���Ͽ� �����ڵ���� ��µ��� ������ return�� ���ȴ�
			//if(i>2){return;}//������ ����
			System.out.println("�ݺ�"+(i));
		}
		System.out.println("main end...");
	}
}