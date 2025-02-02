package com.bit.day26;

public class Ex06 extends Thread{
	static int sum;
	int begin;
	int end;
	Object key;
	
	public Ex06(int begin,int end,Object key){
		this.begin = begin;
		this.end = end;
		this.key = key;
	}
	
	public void sum(int i){
		sum+=i+1;
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
//	public void sum(int i){		
////			sum+=i+1;
//			int hap=i+1;
//		synchronized (key) {
//			sum = sum+hap;
//		}
//	}
//	
//	public static synchronized void sum(int i){
//		int hap = i+1;
//		sum=sum+hap;
//	}
	
	public void run(){
		for(int i = begin; i<end; i++) sum(i);
	}
	
	public static void main(String[] args) {
		
		//1~10000까지의 합계를 구하시오
		//1~5000까지의 합계를 구하시오
		//5001~10000까지의 합계를 구하시오
		int sum = 0;
		for(int i = 0; i<50; i++)sum+=i+1;
		for(int i = 50; i<100; i++)sum+=i+1;		
		System.out.println("1~50 까지의 합계"+sum);
		System.out.println("50~100 까지의 합계"+sum);
		Object key = new Object();
		
		Ex06 me = new Ex06(0, 50, key);
		Ex06 you = new Ex06(50, 100, key);
		me.start();
		you.start();
		try {
			me.join();
			you.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("me+you"+Ex06.sum);
	}
}
