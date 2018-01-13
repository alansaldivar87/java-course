package main.layouts;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FlowLayoutsEx extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	private JLabel label;
	private JButton button;
	private JTextField text;
	
	public FlowLayoutsEx() {
		/*
		 * 1. CREATE A WINDOW
		 * Use this methods always to create the window
		 */
		super("Layouts"); // JFrame constructor
		setSize(400, 300); // Window size
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Destroy application on close
		
		buildGUI();
		
	}
	
	public void buildGUI() {
		/*
		 *  2. CREATE A CONTAINER
		 */
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		/*
		 * 3. ADD COMPONENTS TO THE CONTAINER
		 */
		createLabel(container);
		createText(container);
		createButton(container);
	}
	
	public void createLabel(Container container) {
		label = new JLabel("Nombre");
		container.add(label);
	}
	
	public void createText(Container container) {
		text = new JTextField(20);
		container.add(text);
	}
	
	public void createButton(Container container) {
		button = new JButton("Button");
		button.addActionListener(this); // calls the same class which is implementing the Action Listener
		container.add(button);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String textStr = text.getText();
		label.setText(textStr);
		JOptionPane.showMessageDialog(null, textStr);
	}
	
}
