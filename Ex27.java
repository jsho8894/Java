class Ex27{
	public static void main(String[] args){
		//1~50������ ��
		int add1 = 1;
		int sum1 = 0;
		while(add1<=50){
			sum1= sum1 +add1;
			add1++;
		}
		System.out.println("1~50������ �� ="+sum1);
		System.out.println("--------------------");

		//1~100������ ¦������ ��
		int add2 = 2;
		int sum2 = 0;
		while(add2<=100){
			if(add2%2 == 0){
			sum2 += add2;
			}
			add2++;
		}
		System.out.println("1~100���� ¦���� �� ="+sum2);
		System.out.println("--------------------");

		//1+3++5+7+9=25
		int sum3 = 0;
		int add3 = 1;
		while((add3<=10)){
			if(add3%2 != 0){
			sum3 += add3;
			}
			add3++;
		}
		System.out.println("1+3+5+7+9 ="+sum3);
		System.out.println("--------------------");

		//1~50���� 3�� ���
		boolean first = false;
		int add4 = 3;
		while(add4<=50){
			if(add4%3 == 0){
			if(first){System.out.print(',');}
			System.out.print(add4);
			first = true;
			}
			add4++;
		}
		System.out.println("\n--------------------");

		//2��1��~2�� 5��
		int sum5 = 2;
		int add5 = 1;
		while(add5<=5){
			System.out.println("2��" + add5 + "�� ="+sum5);
			sum5 *=2;
			add5++;
		}
		System.out.println("\n--------------------");
	}
}