class Ex07{
	public static void main(String[] args){
		int water=1200;
		int milk = 800;
		int shrimp = 1500;
		int a = 1;
		int b = 2;
		int c = 3;
		int add = (water*a)+(milk*b)+(shrimp*c);

		System.out.println("[������]");
		System.out.println("-------------------------------------------");
		System.out.println("��ǰ�� \t |�ܰ� \t |���� \t |�ݾ�");
		System.out.println("-------------------------------------------");

		System.out.println("����\t "+water+"\t"+a+"\t"+water*a);

		System.out.println("���ڿ��� "+milk +"\t"+b+"\t"+milk*b);

		System.out.println("�����\t "+shrimp+"\t"+c+"\t"+shrimp*c);

		System.out.println("-------------------------------------------");
		System.out.println("�հ�\t\t\t"+add+"��");
		System.out.println("-------------------------------------------");
		System.out.println("�����մϴ�.");
	}
}