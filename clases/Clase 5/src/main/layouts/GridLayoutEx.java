package main.layouts;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutEx extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public GridLayoutEx() {
		super("GridLayout");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildGUI();
	}
	
	public void buildGUI() {
		Container container = getContentPane();
		container.setLayout(new GridLayout(3, 3));
		
		createButtons(container);
	}
	
	public void createButtons(Container container) {
		for (int i = 1; i <= 9; i++) {
			container.add(new JButton("Boton" + i));
		}
	}
}
