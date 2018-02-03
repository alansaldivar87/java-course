package com.tecgurus.login.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tecgurus.login.dao.DAOFactory;
import com.tecgurus.login.dao.UserDAO;
import com.tecgurus.login.model.User;


public class UserDaoImpl implements UserDAO{
	
	private static final String insertQuery =
			"INSERT INTO USER (Id, Name, Last_Name, Email, Age, Address, Password) VALUES (NULL, ?, ?, ?, ?, ?, ?)";
	
	private static final String findByIdQuery =
			"SELECT * FROM USER WHERE Id = ?";
	
	private static final String findByEmailQuery =
			"SELECT * FROM USER WHERE Email = ?";

	@Override
	public void insert(User user) {
		Connection connection = DAOFactory.getMySqlDB().openConnection();
		
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getLastName());
			preparedStatement.setString(3, user.getEmail());
			preparedStatement.setInt(4, user.getAge());
			preparedStatement.setString(5, user.getAddress());
			preparedStatement.setString(6, user.getPassword());
			preparedStatement.executeUpdate();
			System.out.println("User saved correctly");
			preparedStatement.close();
			connection.close();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	@Override
	public List<User> getAllUsers() {
		Connection connection = DAOFactory.getMySqlDB().openConnection();
		List<User> users = new ArrayList<User>();
		try{
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM USER");
			
			User user = null;
			while(resultSet.next()){
				user = new User();
				user.setId(Integer.parseInt(resultSet.getString("Id")));
				user.setName(resultSet.getString("Name"));
				user.setLastName(resultSet.getString("Last_Name"));
				user.setEmail(resultSet.getString("Email"));
				user.setAge(Integer.parseInt(resultSet.getString("Age")));
				user.setAddress(resultSet.getString("Address"));
				user.setPassword(resultSet.getString("Password"));
				
				users.add(user);
			}
			
			resultSet.close();
			statement.close();
			connection.close();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		Connection connection = DAOFactory.getMySqlDB().openConnection();
		User user = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(findByIdQuery);
			preparedStatement.setInt(1, id);
			
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				user = new User();
				user.setId(Integer.parseInt(resultSet.getString("Id")));
				user.setName(resultSet.getString("Name"));
				user.setLastName(resultSet.getString("Last_Name"));
				user.setEmail(resultSet.getString("Email"));
				user.setAge(Integer.parseInt(resultSet.getString("Age")));
				user.setAddress(resultSet.getString("Address"));
				user.setPassword(resultSet.getString("Password"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		Connection connection = DAOFactory.getMySqlDB().openConnection();
		User user = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(findByEmailQuery);
			preparedStatement.setString(1, email);
			
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()){
				user = new User();
				user.setId(Integer.parseInt(resultSet.getString("Id")));
				user.setName(resultSet.getString("Name"));
				user.setLastName(resultSet.getString("Last_Name"));
				user.setEmail(resultSet.getString("Email"));
				user.setAge(Integer.parseInt(resultSet.getString("Age")));
				user.setAddress(resultSet.getString("Address"));
				user.setPassword(resultSet.getString("Password"));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

}
