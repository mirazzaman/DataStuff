package com.Datas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;


public class DatabaseConnectons {
	
	@Test
	public void dbConnectios() throws ClassNotFoundException, SQLException {
		//Setting class/ Driver Loading
		Class.forName("com.mysql.cj.jdbc.Driver"); // jdbc:mysql://localhost:3306/myschema?serverTimezone=UTC
		System.out.println("\nDriver Loaded..................");
		
		//Set Connection to your DataBase
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/My_Store?serverTimezone=UTC", "root", "ABcd**12");
		System.out.println("\nConnected to mysql db.................\n");
		
		// Create Statement	
		Statement stmnt = con.createStatement();
		
		 // Write Query
		String querie = "SELECT MAX (Yearly_Salary) FROM My_Store.employee_details ";
		
		// Execute query
		ResultSet rSet = stmnt.executeQuery(querie);

		// Console output
		System.err.println("Employee_ID " + "\t" + "First Name " + "\t" + "Last Name " + "\t" + 
		"Department_ID" + "\t"+ "Depertment_Name" + "\t" + "Yerly_Salary" );
		
		while (rSet.next()) {
			System.out.println(rSet.getString("Employee_ID") + "\t\t" + 
								rSet.getString("First_Name") + "\t\t" + 
								rSet.getString("Last_Name") + "\t\t" + 
								rSet.getString("Department_ID") + " \t\t"+ 
								rSet.getString("Depertment_Name") + "\t" + 
								rSet.getString("Yerly_Salary")); 
			}

		
		
		
		
		
		
		
		
	}

}
