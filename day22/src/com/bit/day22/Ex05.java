package com.bit.day22;

public class Ex05 {
	public static void main(String[] args) {
		Runnable work = new Runnable() {
			public void run() {
				Thread me = Thread.currentThread();
				System.out.println(me.getName()+" 시작");
				for(int i= 0; i<50; i++){
					System.out.println(me.getName()+" work"+i);
				}
				System.out.println(me.getName()+" 종료");
			}
		};
		 Thread thr1 = new Thread(work,"첫번쨰");
		 Thread thr2 = new Thread(work,"두번쨰");
		 Thread thr3 = new Thread(work,"세번째");
		 //setPriority - 우선순위(1~10) Max - 10 min -1 
		 thr1.setPriority(Thread.MIN_PRIORITY);
		 thr2.setPriority(Thread.NORM_PRIORITY);
		 thr3.setPriority(Thread.MAX_PRIORITY);
		 
		 thr1.start();
		 thr2.start();
		 thr3.start();
	}
}
