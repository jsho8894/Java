package com.bit.mySelf01;

//Student Ŭ������ �ʵ带 �����ϴºκ�
//�̷��� �ʵ带 ���� �ϰ�  java.lang.Object�� �޼ҵ带 �ش� �ʵ忡 ���߾�
//�������̵��ϴ� �޼ҵ常 ���ϴ�
//�̷��� �����͸� ����ϴ� Ʋ�� �츮�� Value Object Ȥ�� Data Transfer Object�� �ٿ���
//VO Ȥ�� DTO Ŭ������� �θ��ϴ�
//�� ��Ŭ������ �̸��� StruedntVOŬ������ �Ǿ���մϴ�

//���̻� �츮�� �ڵ��� �Ҷ� �� �ܺΰ� �˾ƾ� �ϴ� �޼ҵ尡 �ƴϸ�
//��δ� private ���������ڸ� �����ϰԵ˴ϴ�.
//������ private ���� �����ڴ� �ܺ� Ŭ������ ������ �� ���⶧���� 
//�ش� �ʵ� Ȥ�� �޼ҵ带 �ƿ� ���� �� �� �����ϴ�
//���� �ش� �޼ҵ尡 �� Ŭ���������� ���Ǹ� ����� ������
//���� �ܺ� Ŭ�������� �ʵ��� ���� ��������
//���̻� ���� ������ �Ұ��������ϴ�
//��� �츮�� �޼ҵ带 �����
//�� �޼ҵ������ ���� �ְų� ���� ����� �־�� �մϴ�.

//�̷��� �ܺο� Ŭ���� ���θ� ���δ� �����ϴ°� �ƴ϶�
//�������� �� �ʿ��� �޼ҵ常 �����ϰ� ��� ���������ڸ� private���� �ְ�
//�޼ҵ��θ� �����ϰ� ����°��� ĸ��ȭ��� �մϴ�.
public class StudentVO {
	String name;
	private int korean;
	private int english;
	private int math;
	private int id;

	// �ʵ忡 ���� �ִ� �޼ҵ�� �츮�� setter �޼ҵ��� �մϴ�
	// �ʵ��� ���簪�� ����ϴ� �޼ҵ�� �츮�� getter�޼ҵ��� �մϴ�
	// �� ����� ȭ�鿡 ����� ���ϴ°� �ƴ϶� �� �� ��ü�� �����Ѵٴ� �ǹ� �Դϴ�.
	// ���� �޼ҵ�� �̷��� ������ϴ�
	// public void set�ʵ��(�ʵ�Ÿ�� �ʵ��̸�){
	// this.�ʵ� = �ʵ�;
	// }
	public void setName(String name) {
		this.name = name;
	}

	// ���͸޼���� �̷��� ������ϴ�
	// public �ʵ�Ÿ�� get�ʵ��(){
	// return �ʵ��̸�;
	// }
	public String getNane() {
		return name;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(int korean) {
		this.korean = korean;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	// equals �޼����
	// �Ķ���ͷ� ��� Ŭ������ ��ü�� �Ѿ�ü� �ֽ��ϴ�.
	// �׷� ��� �ؾ� �츮�� ��� Ŭ���� ��ü�� �Ķ���ͷ� �޴�
	// �޼��带 �����Ҽ� ������?
	// 1.��� Ŭ������ ���δ� �����ε����ݴϴ�.
	// 2.�������� ����մϴ�.
	public boolean equals(Object o) {
		// 2���� ��ü�� ���ҋ� ������ �˾ƺ�����
		// 1. 2���� ��ü�� ���� Ŭ���� ��ü���� Ȯ���غ���.
		// 2. 2���� ��ü�� ���� Ŭ���� ��ü�̸� �ش� Ŭ������ �ʵ��� Ư�� �ʵ� Ȥ��
		// ��� �ʵ带 ���ؼ� ��δ� ������ �ΰ��� ���� ��ü�Դϴ�.

		// ���� 2 ��ü�� ���� Ŭ���� ��ü���� �˾ƺ��ϴ�.
		// ���� �ڼ��ϰ� �����ڸ� �Ķ���ͷ� �Ѿ�� o��
		// null�� �ƴϰ� StuentVO Ŭ������ ��ü���� Ȯ���غ��ϴ�.
		// ���⼭ �����ϰ� ����� �ϳ��� 2���� ���ÿ� Ȯ���Ҽ� �ֽ��ϴ�
		if (o instanceof StudentVO) {
			// �� if�� �ȿ� ��� �Դٴ°��� parameter�� �Ѿ�� Object o��
			// StudentVO Ŭ������ ��ü�� ���̹Ƿ�
			// �츮�� StudentVO�� �ʵ带 �������ֽ��ϴ�
			// ������ Object o�̱� ������ �� �ʵ���� o���� �����ü��� ����
			// ��� ����� ����ȯ�� ���ؼ� StudentVO ��ü�� ������ �ֽ��ϴ�.
			StudentVO s = (StudentVO) o;
			if (id == s.id) {
				return true;
			}
		}

		return false;
	}

	@Override
	public String toString() {
		return "�й�: " + id + ", �̸�: " + name + ", ��������: " + korean + ", ��������: "
				+ math + ", ��������: " + english;
	}

}
