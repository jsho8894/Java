import java.util.Scanner;
class Ex13{//c
	public static void main(String[] args){
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է����ּ���: ");
		input = sc.nextInt();

		if(input == 0 ){
			System.out.println("0�Դϴ�.");
		}
		if(input !=0 && input % 2 == 0 && input > 0 ){
			System.out.println("����̰� ¦���Դϴ�");
		}
		if(input !=0 && input % 2 == 0 && input < 0 ){
			System.out.println("�����̰� ¦���Դϴ�");
		}
		if(input !=0 && input % 2 == 1 && input > 0)
		{
			System.out.println("����̰� Ȧ��");
		}
		if(input !=0 && input % 2 == -1 && input < 0)
		{
			System.out.println("�����̰� Ȧ��");
		}
	}
}