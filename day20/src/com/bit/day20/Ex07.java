package com.bit.day20;

public class Ex07 {
	public static void main(String[] args) {
		java.util.Map map1 = new java.util.HashMap();
		//key�� �ߺ��� �Ұ����ϳ� value�� �ߺ��� �����մϴ�
		map1.put("key1","val1");
		map1.put("key2","val2");
		map1.put("key3","val3");
		map1.put("key4",null);//���������δ� �����ϳ� ���̾����� null�̹Ƿ� ���ʿ䰡 �����ϴ�.
		
		map1.put("key1","abcd");//������ Ű���ָ� �װ��� ������ݴϴ�
		map1.put(1234,"ABCD");
		map1.put(true,"ABCDabcd");
		map1.put(null,"1234");
		System.out.println(map1.get("key4"));
		
	}
}
