package com.bit.day07;

class Ex11{
	public static void main(String[] args){
	//����1. �� ���4��
		for(int i = 1; i<5; i++){
			for(int j = 0; j < i; j++){
				if(i>j){
				System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.print("\n---------------------------------\n");
	//����2. ���� ��� 4�� �� 1,2,3�� ���
		int su = 1;
		for(int i = 1; i<5; i++){
			for(int j = 0; j < i; j++){
				if(i>j){
				System.out.print(su+j);
				}
			}
			System.out.println();
		}
		System.out.print("\n---------------------------------\n");
	//����3. ���� ��� 4�� 1~10���� ���
		su = 1;
		for(int i = 1; i<5; i++){
			for(int j = 0; j < i; j++){
				if(i>j){
				System.out.print(su++ +" ");
				}
			}
			System.out.println();
		}
		System.out.print("\n---------------------------------\n");
	//����4. ���� �빮�� ���4�� A~J����
		char tmp=(char)('A');
		for(int i = 0; i<5 ; i++){
			for(int j = 0; j<i; j++){
				if(i>j){
					
					System.out.print((char)tmp);
					tmp++;
				}
			}
			System.out.println();
		}
		System.out.print("\n---------------------------------\n");
	//����5. ���� ��� 4�� ���δ� 1������ ���δ� 1������
		su = 0;
		for(int i = 1; i<5; i++){
			for(int j = 0; j < i; j++){
				if(i>j){
				System.out.print(i-su);
				}
			}
			System.out.println();
		}
		System.out.print("\n---------------------------------\n");
	//����6. �� ���4�� 4,3,2,1,��
		for(int i = 0; i<5; i++){
			for(int j = 1; j < 5; j++){
				if(i<j){
				System.out.print("*");
				}
			}
			System.out.println();
		}
		System.out.print("\n---------------------------------\n");
	//����7. �� ���4�� ���� 1�� �ݴ��
		for(int i = 1; i<5; i++){
			for(int j = 4; j > 0; j--){
				if(i<j){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}	
			}
			System.out.println("");
		}

		System.out.print("\n---------------------------------\n");
	//����8. �� ���4�� ������ �����
	}
}