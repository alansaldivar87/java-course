package com.tecgurus.login.views;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.tecgurus.login.util.SessionData;
import com.tecgurus.login.util.UtilFunctions;

public class DashboardView extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel welcomeLbl;
	private JButton calculatorBtn; 
	
	public DashboardView(){
		super();
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildGUI();
	}
	
	public void buildGUI(){
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		
		welcomeLbl = new JLabel("Hola: " + SessionData.getCurrentUser().getName()); 
		container.add(welcomeLbl, BorderLayout.NORTH);
			
		createButtons(container);
		
	}
	
	public void createButtons(Container container){
		calculatorBtn = new JButton("Open Calculator");
		
		calculatorBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				openCalculator();
			}
		});
	
		container.add(calculatorBtn);
	}
	
	public void openCalculator() {
		UtilFunctions.redirect(this, new CalculatorView());
	}
	
}
