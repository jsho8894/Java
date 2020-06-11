package com.bit.day22;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;

public class Ex09 extends Frame{
	
	Ex09(){
		Panel p = new Panel();
		Panel p2 = new Panel();
		

		p2.setBackground(Color.GREEN);
		
		p.setLayout(new GridLayout(1,2));
		Button btn1 = new Button();
		btn1.setLabel("ÇÑ±Û");
		
		
		Button btn2 = new Button("btn2");
		p2.add(btn2);
		p.add(btn1);
		p.add(p2);
		add(p);
		
		setLocation(200,200);
		setSize(500, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex09();
	}
}
