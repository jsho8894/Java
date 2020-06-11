package com.bit.day19;
//처리가 우선
//입력 수정 삭제할때 성능이 높습니다.
//하지만 읽어 오는것이 단점

public class BitLinkedList {//리스트를 사용하지 않고 객체를 사용하여 보여주기
	private Node start;
	private int cnt;
	
	private class Node{
		Node next;
		Object val;
	}
	
	public void add(Object val){
		cnt++;		
//		start= node;
//		start.next= node;
//		start.next.next= node;
//		start.next.next.next= node;
//		start.next.next.next.next= node;
		
		Node node = new Node();
		node.val = val;
		if(cnt ==1){
			start = node;
		}else{
			Node temp = start;
			while(true){
				if(temp.next == null){break;}
				temp = temp.next;
			}
			temp.next = node;
		}
	}
	public int size(){
		return cnt;
	}
//	1	Node node = new Node();
//		node.val = val;
//		start = node;
//	2	Node node = new Node();
//		node.val = val;
//		start.next = node;
//	3	Node node = new Node();
//		node.val = val;
//		start.next.next = node;

		public Object get(int idx){
//			start.val;
//			start.next.val;
//			start.next.next.val;			
			Node temp = start;
			for(int i = 0; i<idx ; i++){
				temp = temp.next;
			}
			return temp.val;
		}
				
}
