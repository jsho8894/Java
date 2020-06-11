class Ex24{
	public static void main(String[] args){
		int sum = 0;//1~10±îÁöÀÇ ÇÕ
		for(int i=0; i<=10; i++){
			sum += i;
		}
		System.out.println("1~10ÀÇ ÇÕ = "+sum);
		System.out.println("---------------------------------------");

		sum = 0;//1~10±îÁöÀÇ Â¦¼öµéÀÇ ÇÕ
		for(int i=2; i<=10; i++){
			if(i%2 ==0){
				sum += i;
			}
		}
		System.out.println("Â¦¼öµéÀÇ ÇÕ = "+sum);
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

		//1~50±îÁöÀÇ 3ÀÇ¹è¼ö Ãâ·Â
		first = false;
		for(int i=3; i<=50; i++){
			if(i%3 == 0){
				if(first){System.out.print(',');}
				System.out.print(i);
				first = true;	
			}
		}

		System.out.println("\n---------------------------------------");
		//1~50±îÁöÀÇ 3ÀÇ¹è¼ö Ãâ·Â
		first = false;
		for(int i=3; i<=50; i+=3){
			if(i%3 == 0){
				if(first){System.out.print(',');}
				System.out.print(i);
				first = true;	
			}
		}

		System.out.println("\n---------------------------------------");
		
		sum = 1;//2ÀÇ1½Â,2ÀÇ2½Â,2ÀÇ3½Â,2ÀÇ4½Â.2ÀÇ 5½ÂÀ» Ãâ·Â
		for(int i=1; i<=5; i++){
			sum = sum * 2;
			System.out.println("2ÀÇ" + i + "½Â ="+sum);
		}		
		System.out.println("\n---------------------------------------");

		sum = 1;//2ÀÇ1½Â,2ÀÇ2½Â,2ÀÇ3½Â,2ÀÇ4½Â.2ÀÇ 5½ÂÀ» Ãâ·Â
		for(int i=1; i<=5; i++){
			System.out.println("2ÀÇ" + i + "½Â ="+sum*2);
		sum = sum*2;
		}

		System.out.println("\n---------------------------------------");
		
		//2ÀÇ1½Â,2ÀÇ2½Â,2ÀÇ3½Â,2ÀÇ4½Â.2ÀÇ 5½ÂÀ» Ãâ·Â
		for(int i=1; i<6; i++){
			sum = 1;
			for(int j=1; j<=i; j++){
				sum*=2;
			}
			System.out.println(sum);
		}
	}
}