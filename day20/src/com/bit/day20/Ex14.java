package com.bit.day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import javax.swing.text.html.parser.Entity;

public class Ex14 {
	
	// Hashtable ,HashMap의 공통점
	//내부적으로 모두 Hash기법을 사용합니다.
	//Map인터페이스를 구현하고 있습니다
	//Key와 Value를 이용해서 Data를 솬리합니다
	//Hashtable, HashMap의 차이점
	//Hashtable은 동기화가 보장됩니다 반대로 HashMap는 보장되지 않습니다.
	
	
	
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
