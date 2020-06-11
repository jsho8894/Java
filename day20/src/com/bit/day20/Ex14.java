package com.bit.day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

public class Ex14 {
	
	// Hashtable ,HashMap�� ������
	//���������� ��� Hash����� ����մϴ�.
	//Map�������̽��� �����ϰ� �ֽ��ϴ�
	//Key�� Value�� �̿��ؼ� Data�� �߸��մϴ�
	//Hashtable, HashMap�� ������
	//Hashtable�� ����ȭ�� ����˴ϴ� �ݴ�� HashMap�� ������� �ʽ��ϴ�.
	
	
	
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		
		map.put("key1", "val1");
		map.put("key2", "val2");
		map.put("key3", "val3");
		map.put("key4", "val4");
		
		Set<String> keys = map.keySet();
		Iterator<String> ite = keys.iterator();
		while(ite.hasNext()){
			String key = ite.next();
			System.out.println(key+":"+map.get(key));			
		}
//		Set<Entry<String,String>> entrys =  map.entrySet();
//		Iterator<Entry<String,String>> ite = entrys.iterator();
//		while(ite.hasNext()){
//			Entry<String,String> entry =ite.next();
//			System.out.println(entry.getKey()+","+entry.getValue());
//		}
	}
}
