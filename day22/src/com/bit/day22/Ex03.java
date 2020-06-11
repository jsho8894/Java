package com.bit.day22;

public class Ex03 {


	
	public static void main(String[] args) {
		
		Runnable work = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("thread work...");
				
			}
		};
		Thread thr1 = new Thread(work);
		Thread thr2 = new Thread(work);
		
		
		
//		
//		class Inner extends Thread{
//			public void run(){
//				System.out.println("thread work...");
//			}
//		}
//		Thread thr1 = new Thread(){
//			public void run(){
//			System.out.println("thread work...");
//		}
//		};
//		Thread thr2 = new Thread(){
//			public void run(){
//			System.out.println("thread work...");
//		}
//		};
		
		
		thr1.start();
		thr2.start();
	}

}
