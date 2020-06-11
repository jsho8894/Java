package com.bit.day22;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;

public class Ex12 extends Frame {
	Ex12(){
		Panel p = new Panel();
		p.setBackground(Color.BLUE);
//		java.awt.TextArea ta = new TextArea(3,20);
		java.awt.TextArea ta = new TextArea("초기값",5,20,3);
		
//		ta.setText("출력\n두번째줄");
//		ta.setVisible(false);
//		ta.setEditable(false);
		ta.setEnabled(false);
		ta.setColumns(10);
		ta.setRows(10);
		p.add(ta);
		
		Button btn = new Button("버튼");
		btn.setEnabled(false);
		p.add(btn);
		
		add(p);
		setLocation(200,200);
		setSize(300, 400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex12();
	}
}
