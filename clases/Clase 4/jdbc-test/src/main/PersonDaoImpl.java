package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {
	
	Connection connection = null;
	
	public Connection getConnection() {
		try {
			/*
			 *  Class.forName to check if class exists 
			 *  If not catch it with ClassNotFoundException
			 */
			Class.forName("com.mysql.jdbc.Driver");
			if (connection == null) {
				connection = DriverManager.getConnection("jdbc:mysql://localhost/jdbctest?user=root&password=root&useSSL=false");
			}
		} catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
	@Override
	public void insert(Person person) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO PERSON (prs_Id, prs_Name) VALUES (NULL, ?)");
			preparedStatement.setString(1, person.getName());
			preparedStatement.executeUpdate();
			System.out.println("Person saved correctly!");
			preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();			
		}
		
	}

	@Override
	public List<Person> select() {
		List<Person> persons = new ArrayList<Person>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM PERSON");
			
			Person person = null;
			while(resultSet.next()) {
				person = new Person();
				person.setId(Integer.parseInt(resultSet.getString("prs_Id")));
				person.setName(resultSet.getString("prs_Name"));
				
				persons.add(person);
			}
			
			resultSet.close();
			statement.close();			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return persons;
	}
	
	public void closeConnection() {
		try {
			if (connection != null) {
				connection.close();
			}
		} catch (Exception e) {
			
		}
	}
}
