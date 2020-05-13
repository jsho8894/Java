class Ex19{
	public static void main(String[] args){
		//int su = 1234;
		String msg = args[0];
		System.out.println("input>>>" + msg);
		if(msg == "java"){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		}
		System.out.println("---------------------------------");
		switch(msg){
			case"java":
			System.out.println("같다");
			break;

			default:
			System.out.println("다르다");
		}
	}
}