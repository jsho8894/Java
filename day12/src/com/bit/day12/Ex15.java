package com.bit.day12;

public class Ex15 {
	public static void main(String[] args) {
		String msg1 = "abcd";
		String msg2 = "abcd";
		String msg3 = "abc";
		String msg4 = "abcabadsfdsf";
		
		
		System.out.println(msg1.compareTo(msg2));//ó������ ������ ������ ũ�⸦ ���� ��ŭ�� ���� ���ϰ� ��� ����
		System.out.println(msg1.compareTo(msg3));//������ ũ�Ⱑ ������ ���̸� ���Ͽ��ݴϴ�
		System.out.println(msg1.compareTo(msg4));//3�������� abcd-abca�� +3�Դϴ� ���� ����񱳴� ���ϱ⶧���� �̷��� ǥ���� �˴ϴ�.
	}
}
