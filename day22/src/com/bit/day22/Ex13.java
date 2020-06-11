package com.bit.day22;

import java.awt.Checkbox;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;

public class Ex13 extends Frame{

	public Ex13(){
		Panel p = new Panel();
		Font font = new Font("�ü�ü",0,22);
		java.awt.Checkbox chk01= new Checkbox("item1");
		Checkbox chk02 = new Checkbox("item2",true);
		Checkbox chk03 = new Checkbox();
		chk03.setLabel("item3");
		
		chk01.setFont(font);
		chk02.setFont(font);
		chk03.setFont(font);
		
		p.add(chk01);
		p.add(chk02);
		p.add(chk03);
		
		
		add(p);
		setLocation(200,200);
		setSize(300, 400);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex13();
	}

}
