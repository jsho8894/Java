class Ex19{
	public static void main(String[] args){
		//int su = 1234;
		String msg = args[0];
		System.out.println("input>>>" + msg);
		if(msg == "java"){
			System.out.println("����");
		}else{
			System.out.println("�ٸ���");
		}
		System.out.println("---------------------------------");
		switch(msg){
			case"java":
			System.out.println("����");
			break;

			default:
			System.out.println("�ٸ���");
		}
	}
}