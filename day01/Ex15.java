class Ex15{
	public static void main(String[] args){
		float kor=94;
		float eng=80;
		float math=77;
		float add = kor+eng+math ;
		float hak = add/3;

		System.out.println("성적관리 프로그램(ver 0.0.1)");
		System.out.println("-----------------------------------------");
		System.out.println("국어"+(int)kor);
		System.out.println("영어"+(int)eng);
		System.out.println("수학"+(int)math);
		System.out.println("-----------------------------------------");
		System.out.println("합계"+(int)add);
		System.out.println("-----------------------------------------");
		System.out.println("평균" + String.format("%.2f", hak));
		System.out.println("-----------------------------------------");		
		if(hak >= 90)
		{
			System.out.println("A입니다");
		}else if(hak >= 80)
		{
			System.out.println("B입니다");
		}else if(hak >= 70)
		{
			System.out.println("C입니다");
		}else if(hak >= 60)
		{
			System.out.println("D입니다");
		}
		else
		{
			System.out.println("F입니다");
		}
	}		
}