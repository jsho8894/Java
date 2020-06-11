package com.bit.day20;

public class Ex07 {
	public static void main(String[] args) {
		java.util.Map map1 = new java.util.HashMap();
		//key의 중복은 불가능하나 value의 중복은 가능합니다
		map1.put("key1","val1");
		map1.put("key2","val2");
		map1.put("key3","val3");
		map1.put("key4",null);//문법적으로는 가능하나 값이없으면 null이므로 할필요가 없습니다.
		
		map1.put("key1","abcd");//동일한 키를주면 그값을 덮어씌워줍니다
		map1.put(1234,"ABCD");
		map1.put(true,"ABCDabcd");
		map1.put(null,"1234");
		System.out.println(map1.get("key4"));
		
	}
}
