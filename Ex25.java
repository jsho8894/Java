class Ex25{
	public static void main(String[] args){		
		//2단부터 9단까지

		for(int i=1; i<=9; i++){
			for(int j=2; j<=9; j++)
				{
				System.out.print(j+"*"+i+"="+(i*j));
				System.out.print("\t");
				if(j == 9){System.out.print("\n");}
			}	
		}
	}
}