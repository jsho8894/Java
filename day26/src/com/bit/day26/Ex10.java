package com.bit.day26;

public class Ex10 extends Thread{
	
	boolean running;
	public void run(){		
		while(true){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(running){
				System.out.println("Ãâ·Â");
			}			
		}
	}
	public static void main(String[] args) {
		Ex10 me = new Ex10();
		Ex10 you = new Ex10();
		me.start();
//		you.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.running = true;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		me.running = false;
	}
}
