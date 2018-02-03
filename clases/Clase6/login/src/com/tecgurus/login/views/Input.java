package com.tecgurus.login.views;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Input extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel lbl;
	
	private JTextField txt;

	public Input(String text){
		super();
		this.setLayout(new FlowLayout());
		
		lbl = new JLabel(text);
		txt = new JTextField(20);
		
		this.add(lbl);
		this.add(txt);
	}
	
	public void setText(String text){
		txt.setText(text);
	}
	
	public String getText(){
		return txt.getText();
	}
}
