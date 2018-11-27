package org.jspiders.javaApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstCode 
{
	public static void main(String[] args) 
	{
		Connection connection=null;
		Statement statement=null;
		String qry="insert into hibernatedb.student values(10,'avid','ece')";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=avid");
			statement=connection.createStatement();
			statement.executeUpdate(qry);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		

	}

}
