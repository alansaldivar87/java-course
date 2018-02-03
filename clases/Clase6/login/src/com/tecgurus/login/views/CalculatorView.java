package com.tecgurus.login.views;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.tecgurus.login.dao.CalculatorDAO;
import com.tecgurus.login.daoImpl.CalculatorDaoImpl;
import com.tecgurus.login.model.Calculator;
import com.tecgurus.login.util.UtilFunctions;

public class CalculatorView extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JTextField screen;
	private String operation;
	private double num1;
	private double num2;
	private double resultValue;
	private static final int WINDOW_WIDTH = 400;
	private static final int WINDOW_HEIGHT = 350;
	
	public CalculatorView() {
		super("Calculator");
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		buildGUI();
	}
	
	public void buildGUI() {
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		createScreen(container);
		createNumberButtons(container);
		createOperationButtons(container);
	}
	
	public void createScreen(Container container) {
		screen = new JTextField();
		screen.setFont(new Font("Courier", Font.BOLD, 20));
		screen.setPreferredSize(new Dimension(WINDOW_WIDTH, 60));
		screen.setEnabled(false);
		container.add(screen, BorderLayout.NORTH);
	}
	
	public void createNumberButtons(Container container) {
		JButton btn;
		JPanel buttonsPanel = new JPanel();
		
		buttonsPanel.setPreferredSize(new Dimension(WINDOW_WIDTH - 150, WINDOW_HEIGHT - screen.getHeight()));
		buttonsPanel.setLayout(new GridLayout(4, 3));
		
		for (int i = 1; i <= 9 ;i++) {
			btn = new JButton(String.valueOf(i));
			btn.addActionListener(getNumberActionListener());
			buttonsPanel.add(btn);
		}
		
		btn = new JButton(".");
		btn.addActionListener(getNumberActionListener());
		buttonsPanel.add(btn);
		
		btn = new JButton("0");
		btn.addActionListener(getNumberActionListener());
		buttonsPanel.add(btn);
		
		btn = new JButton("C");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				screen.setText("");
			}
		});
		buttonsPanel.add(btn);
		
		JButton btnResult = new JButton("=");
		btnResult.setPreferredSize(new Dimension(WINDOW_WIDTH - 150, 40));
		btnResult.addActionListener(result());
		
		container.add(buttonsPanel, BorderLayout.LINE_START);
		container.add(btnResult, BorderLayout.SOUTH);		
	}
	
	public void createOperationButtons(Container container) {
		JButton btn;
		JPanel opButtonsPanel = new JPanel();
		
		opButtonsPanel.setPreferredSize(new Dimension(140, WINDOW_HEIGHT - screen.getHeight()));
		opButtonsPanel.setLayout(new GridLayout(4, 1));
		
		btn = new JButton("+");
		btn.addActionListener(getOpButtonsListener());
		opButtonsPanel.add(btn);
		
		btn = new JButton("-");
		btn.addActionListener(getOpButtonsListener());
		opButtonsPanel.add(btn);
		
		btn = new JButton("/");
		btn.addActionListener(getOpButtonsListener());
		opButtonsPanel.add(btn);
		
		btn = new JButton("*");
		btn.addActionListener(getOpButtonsListener());
		opButtonsPanel.add(btn);
		
		container.add(opButtonsPanel, BorderLayout.LINE_END);		
	}
	
	public ActionListener getNumberActionListener() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				screen.setText(screen.getText() + btn.getText());
			}
		};
	}
	
	public ActionListener getOpButtonsListener() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn = (JButton) e.getSource();
				operation = btn.getText();
				num1 = Double.valueOf(screen.getText());
				
				screen.setText("");
			}
		};
	}
	
	public ActionListener result() {
		
		Calculator calculator = new Calculator();
		
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					num2 = Double.valueOf(screen.getText());
					switch (operation) {
					case "+":
						resultValue = num1 + num2;
						break;
					case "-":
						resultValue = num1 - num2;
						break;
					case "*":
						resultValue = num1 * num2;
						break;
					case "/":
						resultValue = num1 / num2;
						break;			
					}
					
					calculator.setNum1(num1);
					calculator.setNum2(num2);
					calculator.setOperation(operation);
					calculator.setResult(resultValue);
					
					CalculatorDAO calculatorDAO = new CalculatorDaoImpl();
					calculatorDAO.insert(calculator);
					
					screen.setText("");
					screen.setText(String.valueOf(resultValue));
				} catch (NumberFormatException| NullPointerException ex) {
					screen.setText("ERROR");
				}				
			}
		};
	}
}
