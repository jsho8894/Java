class Ex24{
	public static void main(String[] args){
		int sum = 0;//1~10������ ��
		for(int i=0; i<=10; i++){
			sum += i;
		}
		System.out.println("1~10�� �� = "+sum);
		System.out.println("---------------------------------------");

		sum = 0;//1~10������ ¦������ ��
		for(int i=2; i<=10; i++){
			if(i%2 ==0){
				sum += i;
			}
		}
		System.out.println("¦������ �� = "+sum);
		System.out.println("---------------------------------------");

		sum = 0;//1+3+5+7+9 = 25
		boolean first = false;
		for(int i=1; i<=10; i++){
			if(i%2 !=0){
				sum += i;
				if(first){System.out.print('+');}
				System.out.print(i);
				first = true;
			}
		}
		System.out.println("="+sum);
		System.out.println("---------------------------------------");

		//1~50������ 3�ǹ�� ���
		first = false;
		for(int i=3; i<=50; i++){
			if(i%3 == 0){
				if(first){System.out.print(',');}
				System.out.print(i);
				first = true;	
			}
		}

		System.out.println("\n---------------------------------------");
		//1~50������ 3�ǹ�� ���
		first = false;
		for(int i=3; i<=50; i+=3){
			if(i%3 == 0){
				if(first){System.out.print(',');}
				System.out.print(i);
				first = true;	
			}
		}

		System.out.println("\n---------------------------------------");
		
		sum = 1;//2��1��,2��2��,2��3��,2��4��.2�� 5���� ���
		for(int i=1; i<=5; i++){
			sum = sum * 2;
			System.out.println("2��" + i + "�� ="+sum);
		}		
		System.out.println("\n---------------------------------------");

		sum = 1;//2��1��,2��2��,2��3��,2��4��.2�� 5���� ���
		for(int i=1; i<=5; i++){
			System.out.println("2��" + i + "�� ="+sum*2);
		sum = sum*2;
		}

		System.out.println("\n---------------------------------------");
		
		//2��1��,2��2��,2��3��,2��4��.2�� 5���� ���
		for(int i=1; i<6; i++){
			sum = 1;
			for(int j=1; j<=i; j++){
				sum*=2;
			}
			System.out.println(sum);
		}
	}
}