class Ex38{
	
	public static void main(String[] args){
		//1.A~Z���� ���
		char inA = 'A';
		int i = 1;
		while(i <27){
			System.out.print(inA);
			inA +=1;
			i++;
		}
		System.out.print("\n---------------------------------\n");
		//2.a~z���� ���
		char ina = 'a';
		i = 1;
		while(i <27){
			System.out.print(ina);
			ina +=1;
			i++;
		}
		System.out.print("\n---------------------------------\n");
		//3.A(a) B(b)........Z(z)���
		inA = 'A';
		ina = 'a';
		i = 1;
		while(i <27){
			System.out.print(inA+"("+ina+")");
			ina +=1;
			inA +=1;
			i++;
		}
		System.out.print("\n---------------------------------\n");
		/*4.**** ���
		    ****
		    **** */
		for(i = 0; i<3; i++){
			for(int j = 0; j<4; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.print("\n---------------------------------\n");
		/*5.123 ���
		    456
		    789 */
		int sum = 0;
		for(i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				sum +=1;
				System.out.print(sum);
			}
			System.out.println("");
		}
		System.out.print("\n---------------------------------\n");
		/*6.123 ���
		    234
		    345 */
		sum = 0;
		for(i = 0; i<3; i++){
			for(int j = 0; j<3; j++){
				sum +=1;
				System.out.print(sum);
			}
			sum -=2;
			System.out.println("");
		}
	}
}