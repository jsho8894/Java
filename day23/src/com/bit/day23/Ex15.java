package com.bit.day23;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


class Lec15 implements WindowListener{

	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}
	
}

public class Ex15 extends Frame{
	public Ex15() {
		setTitle("����");
		addWindowListener(new Lec15(){
			public void windowClosing(WindowEvent e){
				dispose();
			}
		});
		setSize(800, 600);
		setLocation(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex15();
		
		
	}
}
