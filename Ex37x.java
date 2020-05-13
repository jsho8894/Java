class Ex37x{//class st

	public static int inputPrint(String msg){//inputPrint st
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.print(msg);
		int su = sc.nextInt();
		return su;
	}//inputPrint ed
	public static int func(int su1,int su2,int su3){//func st
		int result = 0;
		if(su3 ==1)
		{
			result = su1+su2;
		}
		else if(su3 ==2)
		{
			result = su1-su2;
		}
		else if(su3 ==3)
		{
			result = su1*su2;
		}
		else if(su3 ==4)
		{
			result = su1/su2;
		}	
		return result;
	}//func ed
	public static char func2(int su3){//func2 st
		char result = 'E';
		if(su3 ==1){
			result = '+';
		}else if(su3 ==2){
			result = '-';
		}else if(su3 ==3){
			result = '×';
		}else if(su3 ==4){
			result = '÷';
		}
		return result;
	}//func2 ed

	public static void resultPrint(int su1,int su2,int su3){//resultPrint st
		if(su3==1||su3==2||su3==3||(su3==4&&su1%su2==0)){
			System.out.println("결과:"+su1+func2(su3)+su2+"="+func(su1,su2,su3));
		}else{
			System.out.println("결과:"+su1+func2(su3)+su2+"="+(su1*1.0/su2));
		}
	}////resultPrint ed

	public static void main(String[] args){//main st
		int su1 = 0;
		int su2 = 0;
		int su3 = -1;
		do{
			su1 = inputPrint("1번째 숫자");
			su2 = inputPrint("2번째 숫자");
			su3 = inputPrint("1.+ 2.- 3.× 4.÷ >>");

		System.out.println("결과:"+su1+func2(su3)+su2+"="+func(su1,su2,su3));
		}while(inputPrint("1.계속0.종료>>")!=0);
		System.out.println("감사합니다");
	}//main ed

}//class ed