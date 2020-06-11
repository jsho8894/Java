class Ex07{
	public static void main(String[] args){
		int water=1200;
		int milk = 800;
		int shrimp = 1500;
		int a = 1;
		int b = 2;
		int c = 3;
		int add = (water*a)+(milk*b)+(shrimp*c);

		System.out.println("[영수증]");
		System.out.println("-------------------------------------------");
		System.out.println("상품명 \t |단가 \t |수량 \t |금액");
		System.out.println("-------------------------------------------");

		System.out.println("생수\t "+water+"\t"+a+"\t"+water*a);

		System.out.println("초코우유 "+milk +"\t"+b+"\t"+milk*b);

		System.out.println("새우깡\t "+shrimp+"\t"+c+"\t"+shrimp*c);

		System.out.println("-------------------------------------------");
		System.out.println("합계\t\t\t"+add+"원");
		System.out.println("-------------------------------------------");
		System.out.println("감사합니다.");
	}
}