package com.bit.tcp03;

import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class MultiClient extends Frame implements ActionListener{
	TextField tf;
	Socket sock;
	
	public MultiClient(Socket sock) {
		this.sock=sock;
		tf=new TextField();
		tf.addActionListener(this);
		add(tf);
		setSize(400,80);
		setLocation(300,200);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		OutputStream os=null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		try {
			os=sock.getOutputStream();
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw);
			bw.write(tf.getText());
			bw.newLine();
			bw.flush();
			tf.setText("");
			tf.setText("");
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
	}

	public static void main(String[] args) {
		String ip="192.168.0.191";
		int port=8080;
		Socket sock=null;
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		try {
			sock=new Socket(ip,port);
			MultiClient me = new MultiClient(sock);
			is=sock.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			while(true){
				String msg=br.readLine();
				if(msg==null)break;
				if(msg.isEmpty())break;
				System.out.println(msg);
			}
		} catch (IOException e) {
//			e.printStackTrace();
		} finally {
			try {
				if(br!=null)br.close();
				if(isr!=null)isr.close();
				if(is!=null)is.close();
				if(sock!=null)sock.close();
			} catch (IOException e) {
//				e.printStackTrace();
			}
		}

	}

}
