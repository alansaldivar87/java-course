package com.tecgurus.login.views;

import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PasswordInput extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel lbl;

	private JPasswordField txt;


	public PasswordInput(String text){
		super();
		this.setLayout(new FlowLayout());
		
		lbl = new JLabel(text);
		txt = new JPasswordField(20);
		
		this.add(lbl);
		this.add(txt);
	}
	
	public String getText(){
		return String.valueOf(txt.getPassword());
	}


}
