package com.bit.day12;

public class Ex11 {
	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		String input = null;
		char gender='여';
		int age = 1;
		boolean boo = false;
		
		do{
			System.out.println("주민번호 입력");
			input = sc.nextLine();
			//input = "990206-2124567";
			char[] arr = input.toCharArray();
			
			if(arr.length==14&&arr[6]=='-')
			{
				boolean temp = true;
				for(int i =0; i<arr.length; i++)
				{
					if(i==6){continue;}
					if(arr[i]<'0'||arr[i]>'9'){temp = false;break;}
				}
				if(temp){boo=true;}
			}
			/////////
			if(boo){
				char[] arr2 =new char[2];
				for(int i=0; i<arr2.length; i++){
					arr2[i]=arr[i];
				}
				String year1 = new String(arr2);
				if(arr[7]=='1'||arr[7]=='2'){year1=19+year1;}
				if(arr[7]=='3'||arr[7]=='4'){year1=20+year1;}
				age += 2020-Integer.parseInt(year1);
				if(arr[7]=='3'||arr[7]=='3'){gender='남';}
				System.out.println("당신은 나이"+ age + "세의 "+gender+"자입니다");
			}else{
				System.out.println("다시 확인하시고 입력해주세요");
			}
		}while(!boo);
	}
}
