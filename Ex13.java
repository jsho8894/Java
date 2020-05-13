import java.util.Scanner;
class Ex13{//c
	public static void main(String[] args){
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해주세요: ");
		input = sc.nextInt();

		if(input == 0 ){
			System.out.println("0입니다.");
		}
		if(input !=0 && input % 2 == 0 && input > 0 ){
			System.out.println("양수이고 짝수입니다");
		}
		if(input !=0 && input % 2 == 0 && input < 0 ){
			System.out.println("음수이고 짝수입니다");
		}
		if(input !=0 && input % 2 == 1 && input > 0)
		{
			System.out.println("양수이고 홀수");
		}
		if(input !=0 && input % 2 == -1 && input < 0)
		{
			System.out.println("음수이고 홀수");
		}
	}
}