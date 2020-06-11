package com.bit.day20;

public class Ex01 {
	public static void main(String[] args) {
		// vector
		java.util.Vector vec01 = new java.util.Vector();
		vec01.addElement("첫번째");
		vec01.addElement("두번째");
		vec01.addElement("세번째");
		vec01.addElement("네번째");
	
//		for(int i = 0; i<vec01.size(); i++){
//			System.out.println(vec01.get(i));
//		}
		
		vec01.insertElementAt("3번쨰",2);
//		vec01.removeElementAt(3);
//		
//		vec01.removeElement("두번째");
		
		java.util.Enumeration em = vec01.elements();
		
		System.out.println("----------------------------");
		String ele = (String) em.nextElement();
		ele = "1234";
		System.out.println("----------------------------");
		
		java.util.Enumeration em2 = vec01.elements();
		while(em.hasMoreElements()){
			System.out.println(em2.nextElement());
		}
		


		
		
//		System.out.println(vec01.elementAt(0));
//		System.out.println(vec01.elementAt(1));
//		System.out.println(vec01.elementAt(2));
//		System.out.println(vec01.elementAt(3));
			
	}
}
