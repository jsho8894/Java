class Ex152{
	public static void main(String[] args){
		int kor=77;
		int eng=33;
		int math=66;
		int add = kor+eng+math ;
		double avg = add * 100/3/100.0;

		System.out.println("성적관리 프로그램(ver 0.0.1)");
		System.out.println("-----------------------------------------");
		System.out.println("국어" + kor);
		System.out.println("영어" + eng);
		System.out.println("수학" + math);
		System.out.println("-----------------------------------------");
		System.out.println("합계"+ add);
		System.out.println("-----------------------------------------");
		System.out.println("평균" + avg);
		System.out.println("-----------------------------------------");		
		if(avg >= 90)
		{
			System.out.println("A입니다");
		}else if(avg >= 80)
		{
			System.out.println("B입니다");
		}else if(avg >= 70)
		{
			System.out.println("C입니다");
		}else if(avg >= 60)
		{
			System.out.println("D입니다");
		}
		else
		{
			System.out.println("F입니다");
		}
	}		
}