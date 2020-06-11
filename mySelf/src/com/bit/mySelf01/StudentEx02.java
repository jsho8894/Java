package com.bit.mySelf01;

import java.util.ArrayList;
//우리는 왜 배열에 맞춰서 메서드를 만들어야 하나
//부제 ArrayList는 답을 알고있다.

//Collections Framework에는
//같은 종류의 여러 객체를 한번에 다룰 수 있게 해주는
//다양한 클래스들이 있습니다
//가장 대표적인 예가 바로 우리가 지금 배울 ArrayList입니다.
public class StudentEx02 {
	public static void main(String[] args) {
		ArrayList<StudentVO> list = new ArrayList<>();//클래스 객체여서 생성자를 붙여주어야합니다.
		//<>는 template 이라고 부릅니다
		//template이란 해당 콜랙션 객체가 무슨 클래스의 집합인지 지정합니다.
		//단 template안에는 클래스만 들어갈수 있습니다.
		//왜냐하면 이 Collection Framework는 주소값을 이용하여 집합내의 요소들을
		//컨트롤 하기때문에 주소값이 존재하지 않는 기본형 데이터타입들은
		//template안에 들어갈수 없습니다.
		//그래서 자바는 이 기본형 데이터타입을 클래스로의 형태로 바꾼
		//포장클래스(wrapper클래스)가 존재합니다
		
		//Collection Framework는 equals() 메소드를 적극적으로 내부에서 활용합니다.
		//따라서 Collection Framework에 들어있는 클래스를 제대로 활용하기 위해서는
		//클래스에 equals() 메서드를 정의하는것이 매우 중요합니다.
		//이유는 java.lang.Object의 equals 메서드는
		//return this == o;만 적혀있기때문입니다.
		
		//arrayList의 경우 크기가 자동으로 변환됩니다.
		//arrayList의 현재 크기는 size() 메서드를 실행시키면됩니다.
		System.out.println("list의 현재크기:"+ list.size());
		
		StudentVO s = new StudentVO();
		s.setName("aaa");
		s.setKorean(81);
		s.setEnglish(80);
		s.setMath(80);
		
		StudentVO s2 = new StudentVO();
		s2.setName("bbb");
		s2.setKorean(81);
		s2.setEnglish(80);
		s2.setMath(80);
		
		StudentVO s3 = new StudentVO();
		s3.setName("ccc");
		s3.setKorean(81);
		s3.setEnglish(80);
		s3.setMath(80);
		
		StudentVO s4 = new StudentVO();
		s4.setName("ddd");
		s4.setKorean(81);
		s4.setEnglish(80);
		s4.setMath(80);
		
		StudentVO s5 = new StudentVO();
		s5.setName("eee");
		s5.setKorean(81);
		s5.setEnglish(80);
		s5.setMath(80);
		
		//arrayList에 추가할때는
		//list.add(추가할것)를 실행하면됩니다
		list.add(s);
		System.out.println("list의 현재크기:"+ list.size());
		list.add(s2);
		System.out.println("list의 현재크기:"+ list.size());
		list.add(s3);
		System.out.println("list의 현재크기:"+ list.size());
		list.add(s4);
		System.out.println("list의 현재크기:"+ list.size());
		list.add(s5);
		System.out.println("list의 현재크기:"+ list.size());
		
		//만약 특정 위치에 끼어넣기를 하면?
		//원래 그 번호에 있던 객체부터는 하나씩 뒤로 밀리고 그 위치에 
		//파라미터로 넘긴 객체가 들어감니다.
		//이때 add(index, element)로 실행합니다.
		StudentVO s6 = new StudentVO();
		s6.setName("fff");
		s6.setKorean(81);
		s6.setEnglish(80);
		s6.setMath(80);
		
		//list에서 해당 위치의 객체를 호출할때에는
		//get(index)로 호출합니다.
		System.out.println("index 2의 studentVO 의 getName():"+list.get(2).getName());
		list.add(2, s6);
		System.out.println("index 2의 studentVO 의 getName():"+list.get(2).getName());
		
		//list에서 해당 객체의 위치를 알고 싶을때에는
		//indexOf(e)로 호출합니다
		System.out.println("s4의 list index:"+list.indexOf(s4));
		
		//만약 해당객체가 리스트에 여러개 있다면 항상 제일 앞에있는
		//index가 리턴됩니다.
		list.add(s4);
		//만약 가장 뒤에 있는 index가 궁금하면
		System.out.println("s4의 list lastindex:"+list.lastIndexOf(s4));
		
		//index까진 필요없고 리스트에 얘가 있는지 없는지만 알고 싶다면
		//contains()를 실행하면 됩니다.
		System.out.println("contains(s4)"+list.contains(s4));
		
		//indexOf,lastIndexOf,contains 모두
		//존재하지 않는 객체를 찾으라고 시키면
		//각각 -1, -1, false가 리턴됩니다.
		
		//list에서 삭제할떄 2가지 방법이 가능합니다
		//1. 해당 인덱스를 삭제해주세요
		//2. 해당 객체와 일치하는 요소중에서 가장 앞번호를 삭제해주세요
		System.out.println("list의 현재크기:"+ list.size());
		list.remove(0);
		System.out.println("list의 현재크기:"+ list.size());
		
		System.out.println("contains(s6)"+list.contains(s6));
		
		StudentVO s60 = new StudentVO();
		s60.setName("fff");
		s60.setKorean(81);
		s60.setEnglish(80);
		s60.setMath(80);
		list.remove(s60);
		System.out.println("contains(s6)"+list.contains(s6));
	}
}
