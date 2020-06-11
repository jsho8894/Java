class Ex08{ 
//클래스의 선언은 class 클래스명{코드;}
//클래스명 명명규칙: 첫글자는 영문 대문자로시작,띄어쓰기나 특수문자 불가(예외로_와$는사용가능합니다)
//단어와 단어 조합은 다음단어 첫글자를 대문자로 적어줍니다
//주석을 표현할때는 //나 /**/를 사용하여줍니다.//는 한줄을 주석처리 해주며 /**/은 다중 주석이 가능합니다
	public static void main(String[] args){
		System.out.println('#');
		System.out.println("문자열");
		System.out.println('문'+'자'+'열');
		System.out.println("문\t자\n열");
		System.out.println("1.문"+"\t"+'자');
		System.out.println("2.문"+"\u0009"+'자');
		System.out.println("3.문"+(char)9+'자');
		System.out.println("4.문"+'	'+'자');
		System.out.println("1.첫번째 문장입니다");
		System.out.println("1.두번째 문장입니다");

		System.out.println("2.첫번째 문장입니다\n2.두번째 문장입니다");

		System.out.println("3.첫번째 문장입니다\n"+
				"3.두번째 문장입니다");
		System.out.println("path=C:\\java\\jdk");
	}
}