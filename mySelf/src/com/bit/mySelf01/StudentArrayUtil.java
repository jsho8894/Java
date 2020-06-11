package com.bit.mySelf01;
//StudentVO�� ���� �Ҵ��Ͽ�
//�迭�� ũ��� ������� ����� �� �ְ� ���ִ� Ŭ����
public class StudentArrayUtil {
	//�迭�� ũ�⸦ 1 �÷��ִ� �޼ҵ�
	private static StudentVO[] expand(StudentVO[] arr){
		StudentVO[] temp = new StudentVO[arr.length];
		for(int i = 0; i <arr.length; i++){
			temp[i] = arr[i];
		}
		arr = new StudentVO[temp.length +1];
		for(int i = 0; i<temp.length; i++){
			arr[i] = temp[i];
		}
		return arr;
	}
	public static StudentVO[] add(StudentVO[] arr , StudentVO s){
		arr = expand(arr);
		arr[arr.length -1] = s;
		return arr;
	}
	//�迭���� �ش簴ü�� ���° �ε������� �˷��ִ� �޼���
	//��ü�� �� �ҋ��� �񱳿�����(==)�� �ƴ� �޼��带 ���ؼ� ���ؾ��մϴ�
	//������ �񱳿����ڴ� �ʵ��� ����� ���� �ƴ� �ּҰ� ��ü�� ���ϱ� �����Դϴ�
	//�׷��� equals �޼ҵ带 �����ϴ�.
	
	//����� �ε������� Ȯ���ҋ�
	//���࿡ �츮 �迭�� ���� ���� �ε����� �䱸�ϰԵȴٸ�.
	//�迭���� ���� �����Ҽ� ���� ���� ���� �ε����� �ָ�˴ϴ�.
	//���� �����߿� ���� ������ -1�� �����ϰ� ������ָ�˴ϴ�.
	public static int indexOf(StudentVO[] arr, StudentVO s){
		for(int i = 0; i<arr.length; i++){
			if(s.equals(arr[i])){
				return i;
			}
		}
		return -1;	
	}
	//���� �迭���� Ư�� ��ü�� �����ϰ� ũ�⵵ -1�ҷ���
	//������� ���ľ� �ұ�?
	//1.�ش� �迭�� �� ��ü�� �����ϴ��� üũ�մϴ�
	//	�������� ������� �׳� �迭�� �״�� �����ݴϴ�.
	//2.���� ������ �ÿ��� ���� �迭�� temp�� �������ݴϴ�
	//	�������� ���� �迭�� ũ�⸦ �ϳ� �۰� ���� ����ϴ�
	//	������ ������ �����ϵ� indexOf�� ���� �ÿ� �������� �ʽ��ϴ�.
	public static StudentVO[] remove(StudentVO[] arr, StudentVO s){
		//���� S�� arr�� �����ϴ��� Ȯ��
		if(indexOf(arr,s) !=-1){
			int index = indexOf(arr, s);
			StudentVO[] temp = new StudentVO[arr.length];
			for(int i = 0; i<arr.length; i++){
				temp[i] = arr[i];
			}
			arr = new StudentVO[temp.length -1];
			for(int i = 0; i<temp.length; i++){
				if(i<index){
					arr[i] = temp[i];
				}else if(i>index){
					arr[i-1] = temp[i];
				}
			}
		}
		return arr;
	}
}
