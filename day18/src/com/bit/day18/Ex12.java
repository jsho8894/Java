package com.bit.day18;

class Lec05{
	
//	static Local local 
	
	void func01(){
		class Inner{
			void func02(){
				System.out.println("����Ŭ������ ���");
			}
		}
		Inner inn = new Inner();
		inn.func02();
	}
//////////////////////////
	void func02(){
		class Inner{
			void func22(){
				System.out.println("����Ŭ������ ���");
			}
		}
		(new Inner()).func22();
	}
/////////////////////////////	
	void func03(){
		//�͸�Ŭ����
		new Local(){
			public void func22(){
				System.out.println("����Ŭ������ ���");
			}
		};
		
	}
///////////////////////////////
	Local func04(){
		class Inner implements Local{
			public void func22(){
				System.out.println("����Ŭ������ ���");
			}
		};
		return new Inner();
	}
}
interface Local{
	void func22();
}

public class Ex12{
	void func01(){
		System.out.println("Ex12");
	};
	
	public static void main(String[] args) {
	Ex12 me = new Ex12(){
			public void func01(){
				System.out.println("�͸�Ŭ����");
			}
		};
		me.func01();
	}
}
