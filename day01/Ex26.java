class Ex26{
	public static void main(String[] args){
		//제어문(반복문)
		//while문
		/*
			while(조건){
				실행문;
			}
		*/
		int i = 0;//초기값
		while(i<10){ //조건 검사
			i = i+1; //증감식
			System.out.println(i);//실행
		}
		System.out.println("------------------------");
		int a = 1;//초기값
		while(a<=10){ //조건 검사
			
			System.out.println(a);//실행
			a++; //증감식
		}

		//do~while문
		/*
			do{
				실행문;
			}while(조건);
			조건에 상관없이 1회 실행합니다.
		*/
	}
}