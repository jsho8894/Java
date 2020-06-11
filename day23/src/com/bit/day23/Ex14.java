package com.bit.day23;

import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class Ex14 extends Frame implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("이벤트발생");
	}
	public Ex14() {
		Panel p = new Panel();
		TextField tf = new TextField(15);
//		tf.addTextListener(this);
		tf.addActionListener(this);
		p.add(tf);
		List cho = new List();
		cho.addActionListener(this);
		cho.addItem("item1");
		cho.addItem("item2");
		cho.addItem("item3");
		cho.addItem("item4");
		p.add(cho);
		
		Button btn = new Button("버튼");
		btn.addActionListener(this);
		p.add(btn);
		
		add(p);
		setSize(500, 300);
		setLocation(200,200);
		setVisible(true);
	}
//	public void textValueChanged(TextEvent e) {
	//클래스에 implements TextListener 추가
//		System.out.println(((TextField)e.getSource()).getText());
//		
//	}
	
	public static void main(String[] args) {
		new Ex14();
	}

}
