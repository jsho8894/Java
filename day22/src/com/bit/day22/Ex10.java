package com.bit.day22;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;



public class Ex10 extends Frame{
	Ex10(){
		Panel p = new Panel();
		
		p.setLayout(new GridLayout(4,3));
		
		Button btn1 = new Button("1");
		p.add(btn1);
		Button btn2 = new Button("2");
		p.add(btn2);
		Button btn3 = new Button("3");
		p.add(btn3);
		Button btn4 = new Button("4");
		p.add(btn4);
		Button btn5 = new Button("5");
		p.add(btn5);
		Button btn6 = new Button("6");
		p.add(btn6);
		Button btn7 = new Button("7");
		p.add(btn7);
		Button btn8 = new Button("8");
		p.add(btn8);
		Button btn9 = new Button("9");
		p.add(btn9);
		Button btn10 = new Button("*");
		p.add(btn10);
		Button btn11= new Button("0");
		p.add(btn11);
		Button btn12 = new Button("#");
		p.add(btn12);
		add(p);
		
		setLocation(200,200);
		setSize(300, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex10();
	}	
}
