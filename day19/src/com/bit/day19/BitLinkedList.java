package com.bit.day19;
//ó���� �켱
//�Է� ���� �����Ҷ� ������ �����ϴ�.
//������ �о� ���°��� ����

public class BitLinkedList {//����Ʈ�� ������� �ʰ� ��ü�� ����Ͽ� �����ֱ�
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
