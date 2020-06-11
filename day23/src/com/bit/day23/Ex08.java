package com.bit.day23;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Ex08 extends Frame implements MouseMotionListener{
	public Ex08() {
		Panel p = new Panel();
		p.addMouseMotionListener(this);
		
		add(p);
		setSize(800, 600);
		setLocation(200,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex08();
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		int x= e.getX();
		int y= e.getY();
		System.out.println("Dragged"+"x= "+x+"y= "+y);
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("Moved");		
	}
}
