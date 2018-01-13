package main.calculator;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private JTextField screen;
	private String operation;
	private double num1;
	private double num2;
	private double resultValue;
	private static final int WINDOW_WIDTH = 400;
	private static final int WINDOW_HEIGHT = 350;
	
	public Calculator() {
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
			buttonsPanel.add(btn);
		}
		
		btn = new JButton(".");
		buttonsPanel.add(btn);
		
		btn = new JButton("0");
		buttonsPanel.add(btn);
		
		btn = new JButton("C");
		buttonsPanel.add(btn);
		
		JButton btnResult = new JButton("=");
		btnResult.setPreferredSize(new Dimension(WINDOW_WIDTH - 150, 40));
		
		container.add(buttonsPanel, BorderLayout.LINE_START);
		container.add(btnResult, BorderLayout.SOUTH);		
	}
	
	public void createOperationButtons(Container container) {
		JButton btn;
		JPanel opButtonsPanel = new JPanel();
		
		opButtonsPanel.setPreferredSize(new Dimension(140, WINDOW_HEIGHT - screen.getHeight()));
		opButtonsPanel.setLayout(new GridLayout(4, 1));
		
		btn = new JButton("+");
		opButtonsPanel.add(btn);
		
		btn = new JButton("-");
		opButtonsPanel.add(btn);
		
		btn = new JButton("/");
		opButtonsPanel.add(btn);
		
		btn = new JButton("*");
		opButtonsPanel.add(btn);
		
		container.add(opButtonsPanel, BorderLayout.LINE_END);
		
		
	}
	
}
