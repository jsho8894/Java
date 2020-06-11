package com.bit.mySelf01;

import java.util.ArrayList;
import java.util.List;

//��Ʈ�ѷ��� UI�� VO���� �����ؼ� �����ְų�
//UI���� �Է¹��� ���� VO�� ��� ������ ���̽��� �����ִ¿����� �մϴ�
//�츮�� db�� ���⋚���� �׳� ��հ� ������ ����ϴ� �޼ҵ常 �־��ݴϴ�.
public class StudentController {
	//���� DI������ 2���� ����� �ֽ��ϴ�
	//�����ڸ� ���� DI
	//�޼ҵ带 ���� DI
	//���� �����ڸ� ���� DI�� �غ������մϴ�
	//������ list�� �츮�� �ʿ��Ҷ�����
	//db���� �ܾ�;� ������ ������ �츮�� db�� �����Ƿ�
	//���⿡ �ʵ�� �ֽ��ϴ�
	//���� ������(polymorphism)�� Ȱ���ϱ� ���� data tepy�� ArrayList�� �ƴ� List�� �ֽ��ϴ�.
	List<StudentVO>list;
	public StudentController(List<StudentVO> list){
		//�� ��Ʈ�ѷ� Ŭ������ List<StudentVO> list�� �������� �����Դϴ�
		//�׷��ٰ��ؼ� �� ����Ʈ�� ��� �ʱ�ȭ ������ ���⿡ �����ָ�
		//���� �� ����Ʈ�� ������ �������� �ȴٸ� ���⵵ �ٲ���ߵ˴ϴ�.
		//������ �ܺο��� ����Ʈ�� �����ϰԵ˳��m ���⼭�� �׳�
		//�ʱ�ȭ �ڵ常 �ֱ⶧���� �� ���Թ��� ���� �״�� ���⸸ �ϸ�˴ϴ�.
		//�̷��� ������ �ٷ� ������ �����̵˴ϴ�.
		this.list = list;
	}
	public int calculateSum(StudentVO s){
		return s.getKorean() + s.getEnglish()+s.getMath();
	}
	public double calculateAverage(StudentVO s){
		return calculateSum(s)/30;
	}
	public StudentVO findbyId(StudentVO s){
		StudentVO result = null;
		if(list.indexOf(s) != -1){
			int index = list.indexOf(s);
			result = list.get(index);
		}
		return result;
	}
	public void add(StudentVO s){
		if(list.size()==0){
			s.setId(0);
		}else{
			int id = list.get(list.size() - 1).getId() +1;
			s.setId(id);
		}
		list.add(s);
	}
	public void set(StudentVO s){
		int index = list.indexOf(s);
		list.set(index,s);
	}
	public void remove(StudentVO s){
		list.remove(s);
	}
}
