package com.bit.mySelf01;

import java.util.ArrayList;
//�츮�� �� �迭�� ���缭 �޼��带 ������ �ϳ�
//���� ArrayList�� ���� �˰��ִ�.

//Collections Framework����
//���� ������ ���� ��ü�� �ѹ��� �ٷ� �� �ְ� ���ִ�
//�پ��� Ŭ�������� �ֽ��ϴ�
//���� ��ǥ���� ���� �ٷ� �츮�� ���� ��� ArrayList�Դϴ�.
public class StudentEx02 {
	public static void main(String[] args) {
		ArrayList<StudentVO> list = new ArrayList<>();//Ŭ���� ��ü���� �����ڸ� �ٿ��־���մϴ�.
		//<>�� template �̶�� �θ��ϴ�
		//template�̶� �ش� �ݷ��� ��ü�� ���� Ŭ������ �������� �����մϴ�.
		//�� template�ȿ��� Ŭ������ ���� �ֽ��ϴ�.
		//�ֳ��ϸ� �� Collection Framework�� �ּҰ��� �̿��Ͽ� ���ճ��� ��ҵ���
		//��Ʈ�� �ϱ⶧���� �ּҰ��� �������� �ʴ� �⺻�� ������Ÿ�Ե���
		//template�ȿ� ���� �����ϴ�.
		//�׷��� �ڹٴ� �� �⺻�� ������Ÿ���� Ŭ�������� ���·� �ٲ�
		//����Ŭ����(wrapperŬ����)�� �����մϴ�
		
		//Collection Framework�� equals() �޼ҵ带 ���������� ���ο��� Ȱ���մϴ�.
		//���� Collection Framework�� ����ִ� Ŭ������ ����� Ȱ���ϱ� ���ؼ���
		//Ŭ������ equals() �޼��带 �����ϴ°��� �ſ� �߿��մϴ�.
		//������ java.lang.Object�� equals �޼����
		//return this == o;�� �����ֱ⶧���Դϴ�.
		
		//arrayList�� ��� ũ�Ⱑ �ڵ����� ��ȯ�˴ϴ�.
		//arrayList�� ���� ũ��� size() �޼��带 �����Ű��˴ϴ�.
		System.out.println("list�� ����ũ��:"+ list.size());
		
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
		
		//arrayList�� �߰��Ҷ���
		//list.add(�߰��Ұ�)�� �����ϸ�˴ϴ�
		list.add(s);
		System.out.println("list�� ����ũ��:"+ list.size());
		list.add(s2);
		System.out.println("list�� ����ũ��:"+ list.size());
		list.add(s3);
		System.out.println("list�� ����ũ��:"+ list.size());
		list.add(s4);
		System.out.println("list�� ����ũ��:"+ list.size());
		list.add(s5);
		System.out.println("list�� ����ũ��:"+ list.size());
		
		//���� Ư�� ��ġ�� ����ֱ⸦ �ϸ�?
		//���� �� ��ȣ�� �ִ� ��ü���ʹ� �ϳ��� �ڷ� �и��� �� ��ġ�� 
		//�Ķ���ͷ� �ѱ� ��ü�� ���ϴ�.
		//�̶� add(index, element)�� �����մϴ�.
		StudentVO s6 = new StudentVO();
		s6.setName("fff");
		s6.setKorean(81);
		s6.setEnglish(80);
		s6.setMath(80);
		
		//list���� �ش� ��ġ�� ��ü�� ȣ���Ҷ�����
		//get(index)�� ȣ���մϴ�.
		System.out.println("index 2�� studentVO �� getName():"+list.get(2).getName());
		list.add(2, s6);
		System.out.println("index 2�� studentVO �� getName():"+list.get(2).getName());
		
		//list���� �ش� ��ü�� ��ġ�� �˰� ����������
		//indexOf(e)�� ȣ���մϴ�
		System.out.println("s4�� list index:"+list.indexOf(s4));
		
		//���� �ش簴ü�� ����Ʈ�� ������ �ִٸ� �׻� ���� �տ��ִ�
		//index�� ���ϵ˴ϴ�.
		list.add(s4);
		//���� ���� �ڿ� �ִ� index�� �ñ��ϸ�
		System.out.println("s4�� list lastindex:"+list.lastIndexOf(s4));
		
		//index���� �ʿ���� ����Ʈ�� �갡 �ִ��� �������� �˰� �ʹٸ�
		//contains()�� �����ϸ� �˴ϴ�.
		System.out.println("contains(s4)"+list.contains(s4));
		
		//indexOf,lastIndexOf,contains ���
		//�������� �ʴ� ��ü�� ã����� ��Ű��
		//���� -1, -1, false�� ���ϵ˴ϴ�.
		
		//list���� �����ҋ� 2���� ����� �����մϴ�
		//1. �ش� �ε����� �������ּ���
		//2. �ش� ��ü�� ��ġ�ϴ� ����߿��� ���� �չ�ȣ�� �������ּ���
		System.out.println("list�� ����ũ��:"+ list.size());
		list.remove(0);
		System.out.println("list�� ����ũ��:"+ list.size());
		
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
