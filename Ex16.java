class Ex16{ 
	public static void main(String[] args){
		//����(����&�ʱ�ȭ)
		//�ڷ��� ������; //������ ����
		//������ = �ʱⰪ; //������ �ʱ�ȭ
		int a = 1234; //������ ����� �ʱ�ȭ�� ���ÿ�
		System.out.println("a="+a);
		//�ڷ���
		//����
		//����Ʈ�� short�ѿ����� 
		byte su1 = 127;
		short su2= 127;
		int su3= 2147483647;

		long su4= 2147483648L;
		//su4= (long)2147483648;//�̰Ͱ� ���� ������ ���ٰ� �����Ҽ� ������ �������� ����� �ٸ��ϴ�.
		
		//byte su5 = 1;
		//su1 = su5 + 2;//byte�� int�� �������� ������ ���ɴϴ�.

		System.out.println("su1="+su1);
		System.out.println("su2="+su2);
		System.out.println("su3="+su3);
		System.out.println("su4="+su4);
		
		//������(�Ǽ�)
		float su11 = 3.141235f;
		double su12 = 3.141235;
		System.out.println("su11="+su11);
		System.out.println("su12="+su12);
	
		//������(char)
		char ch1;
		ch1 = 'A';
		System.out.println("ch1 =" + (int)ch1);
		System.out.println("65 =" + (char)65);
		System.out.println("66 =" + (char)66);
		System.out.println("67 =" + (char)67);

		//String ������ �ڷ���
		String msg = "���ڿ�";
		System.out.println(msg);

		//���-���ǹ�-if
		//int su21;
		//int su22 = 2;
		//if(su22%2==0){
		//	su21 = 1234;
		//}
		//System.out.println("su21 =" + su21); �̷��� ���� ������ �����ϰ� ���� if�ȿ� ������ ���� Ʋ����� ���� ���⋚���� ������ ó���˴ϴ�.��

		int su21;
		int su22 = 2;
		if(su22%2==0){
			su21 = 1234;
		}else
		{
			su21 = 4321;
		}
		System.out.println("su21 =" + su21);//�̷��� else�� ����ҽ� ���� Ʋ������ �ٸ����� �����Ƿ� ������ ������ �ʽ��ϴ�. ������ �̰��� �׷��� ���� �ڵ�� �ƴմϴ�.
		

		int su = 1;
		if(su == 0){
			System.out.println("0�Դϴ�");
		}else if(su<2){
			System.out.println("1�Դϴ�");
		}else if(su<3){
			System.out.println("2�Դϴ�");
		}


		if(su == 0){
			System.out.println("0�Դϴ�");
		}
		if(su!=0 && su<2){
			System.out.println("1�Դϴ�");
		}
		if(su!=0 && su<3){
			System.out.println("2�Դϴ�");
		}
	}
}