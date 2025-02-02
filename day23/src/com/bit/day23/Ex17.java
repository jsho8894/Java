package com.bit.day23;

import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Lec17 implements WindowListener{
	public void windowActivated(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {}
	public void windowDeactivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowOpened(WindowEvent e) {}	
}

public class Ex17 extends Frame {	
	public Ex17() {
		Panel p = new Panel();
		setTitle("제목없음");//제목
		addWindowListener(new Lec17(){//종료
			public void windowClosing(WindowEvent e){
				dispose();
			}
		});
		
		java.awt.Menu mn1 = new Menu();//메뉴1
		java.awt.MenuItem mn1_1 = new MenuItem();
		mn1.setLabel("File");
		mn1.add(mn1_1);
		mn1_1.setLabel("new");
		
		java.awt.MenuItem mn1_2 = new MenuItem("Save");
		mn1.add(mn1_2);
		mn1.addSeparator();
		java.awt.MenuItem mn1_3 = new MenuItem("Exit");
		mn1.add(mn1_3);
		java.awt.Menu mn2 = new Menu();//메뉴2
		
		java.awt.MenuBar mb = new MenuBar();//메뉴바
		mb.add(mn1);
		mb.add(mn2);
		
		setMenuBar(mb);
		add(p);
		setSize(800, 600);
		setLocation(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex17();
	}
}
