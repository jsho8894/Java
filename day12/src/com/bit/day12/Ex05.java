package com.bit.day12;

public class Ex05 {
	public static void main(String[] args) {
		String msg = "a";
		int[] arr = {1,2,3,4,5};
		try{
			int su = Integer.parseInt(msg);
			System.out.println(arr[su]);
		}
		catch(NumberFormatException e){//���ڿ��� �ƴҽ� ������ ������ ����մϴ�
			
		}
		catch (ArrayIndexOutOfBoundsException e){//�迭�� ��ȿ���� ���� �ε��� ��� ���� �߻�
			
		}
		catch (Exception e) {//����ġ���� ������ ������ ����ϴ°� ��õ�մϴ� java api������

		}
	}
}
