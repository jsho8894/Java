package com.bit.day20;




public class Ex05 {

	public static void main(String[] args) {
		java.util.List list = new java.util.ArrayList();
		
		list.add(1111);
		list.add(5555);
		list.add(7777);
		list.add(3333);
		list.add(2222);

		list.sort(new java.util.Comparator(){
			public int compare(Object o1,Object o2){
				return (int)o1 - (int)o2;//정렬후 순서대로
//				return (int)o2 - (int)o1;//정렬후 역순
//				return -1;// 넣은순서 대로 역순
//				return 1;
			}
		});
		
		for(int i = 0; i <list.size(); i++){
			System.out.println(list.get(i));
		}
		
	}

}
