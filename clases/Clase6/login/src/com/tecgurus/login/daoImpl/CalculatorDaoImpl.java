package com.tecgurus.login.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.tecgurus.login.dao.DAOFactory;
import com.tecgurus.login.dao.CalculatorDAO;
import com.tecgurus.login.model.Calculator;

public class CalculatorDaoImpl implements CalculatorDAO{
	
	private static final String insertQuery =
			"INSERT INTO calculator (Id, Num1, Num2, Operation, Result) VALUES (NULL, ?, ?, ?, ?)";
	
	@Override
	public void insert(Calculator calculator) {
		Connection connection = DAOFactory.getMySqlDB().openConnection();
		
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setDouble(1, calculator.getNum1());
			preparedStatement.setDouble(2, calculator.getNum2());
			preparedStatement.setString(3, calculator.getOperation());
			preparedStatement.setDouble(4, calculator.getResult());
			preparedStatement.executeUpdate();
			System.out.println("Operation saved correctly");
			preparedStatement.close();
			connection.close();
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
