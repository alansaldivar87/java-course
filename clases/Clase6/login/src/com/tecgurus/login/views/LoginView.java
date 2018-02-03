package com.tecgurus.login.views;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.tecgurus.login.dao.UserDAO;
import com.tecgurus.login.daoImpl.UserDaoImpl;
import com.tecgurus.login.model.User;
import com.tecgurus.login.util.SessionData;
import com.tecgurus.login.util.UtilFunctions;

public class LoginView extends JFrame{

	/**
	 * Login view
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton loginBtn;
	
	private JButton registerBtn;
	
	private Input userIn;
	

	private PasswordInput passwordIn;
	
	public LoginView(){
		super();
		setSize(350, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buildGUI();
	}
	
	public void buildGUI(){
		Container container = getContentPane();
		container.setLayout(new FlowLayout());
		
		createUserInput(container);
		createPasswordInput(container);
		createButtons(container);
	}
	
	public void createUserInput(Container container){
		userIn = new Input("Username: ");
		container.add(userIn);
	}
	
	public void createPasswordInput(Container container){
		passwordIn = new PasswordInput("Password: ");
		
		container.add(passwordIn);
	}
	
	public void createButtons(Container container){
		loginBtn = new JButton("Login");
		registerBtn = new JButton("Register");
		
		loginBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				login();
			}
		});
		
		registerBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				UtilFunctions.redirect(LoginView.this, new RegisterView());
			}
		});
		
		container.add(loginBtn);
		container.add(registerBtn);
	}
	
	public void login(){
		String userEmail = userIn.getText();
		UserDAO userDao = new UserDaoImpl();
		User user = userDao.findByEmail(userEmail);
		String hashedPassword = UtilFunctions.hash(passwordIn.getText());
		
		if(hashedPassword.equals(user.getPassword())){
			SessionData.setCurrentUser(user);
			UtilFunctions.redirect(this, new DashboardView());
		}else{
			JOptionPane.showMessageDialog(null, "incorrect password!");
		}
	}
	
	
	
	
}
