package com.tecgurus.login.views;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.tecgurus.login.dao.UserDAO;
import com.tecgurus.login.daoImpl.UserDaoImpl;
import com.tecgurus.login.model.User;
import com.tecgurus.login.util.UtilFunctions;

public class RegisterView extends JFrame{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Input name;
	
	private Input lastName;
	
	private Input email;
	
	private Input age;
	
	private Input address;
	
	private PasswordInput password;
	
	private PasswordInput repeatPassword;
	
	private JButton aceptar;
	
	private JButton cancelar;

	public RegisterView(){
		super();
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildGUI();
	}
	
	public void buildGUI(){
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		createInputs(container);
		createButtons(container);
	}
	
	public void createInputs(Container container){
		name = new Input("Name: ");
		lastName = new Input("Last Name: ");
		email = new Input("Email: ");
		age = new Input("Age: ");
		address = new Input("Address: ");
		password = new PasswordInput("Password: ");
		repeatPassword = new PasswordInput("Repeat Password: ");
		
		container.add(name);
		container.add(lastName);
		container.add(email);
		container.add(age);
		container.add(address);
		container.add(password);
		container.add(repeatPassword);
	}
	
	public void createButtons(Container container){
		aceptar = new JButton("Aceptar");
		cancelar = new JButton("cancelar");
		
		aceptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				registerUser();
			}
		});
		
		cancelar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				UtilFunctions.redirect(RegisterView.this, new LoginView());
			}
		});
		
		container.add(aceptar);
		container.add(cancelar);
	}
	
	
	public void registerUser(){
		User user = new User();
		
		
		if(password.getText().equals(repeatPassword.getText())){
			String hashedPassword = UtilFunctions.hash(password.getText());
			
			user.setName(name.getText());
			user.setLastName(lastName.getText());
			user.setEmail(email.getText());
			user.setAge(Integer.valueOf(age.getText()));
			user.setAddress(address.getText());
			user.setPassword(hashedPassword);
			
			UserDAO userDAO = new UserDaoImpl();
			userDAO.insert(user);
			
			UtilFunctions.redirect(this, new LoginView());
		}else{
			JOptionPane.showMessageDialog(null, "Passwords don't match");
		}
		
		
	}
	
	
}
