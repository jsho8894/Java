package com.bit.day23;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Ex12 extends Frame implements KeyListener{
	Label la;
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("Ű�� ������ ����"+e.getKeyCode());
		int x = la.getX();
		int y = la.getY();
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("Ű�� ���� ����");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("Ű�� ����");
	}
	public Ex12() {
		Panel p = new Panel();
		
		
		
		TextField tf = new TextField(10);
		tf.addKeyListener(this);
		p.add(tf);
		
		Button btn = new Button();
		p.add(btn);
		
		add(p);
		setSize(500, 300);
		setLocation(300,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex12();
	}

}
