package com.TestNGS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DatabaseConnections {
	@Test
	public void connectionTwo() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver"); // jdbc:mysql://localhost:3306/myschema?serverTimezone=UTC
		System.out.println("\nDriver Loaded..................");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/My_Store?serverTimezone=UTC", "root",
				"ABcd**12");
		System.out.println("\nConnected to mysql db.................\n");

		// Create Statement / Write Query
		Statement stmnt = con.createStatement();
		String query = "select * from employee_details order by Yerly_Salary ASC";

		// Execute query
		ResultSet rSet = stmnt.executeQuery(query);

		System.err.println("Employee_ID " + "\t" + "First Name " + "\t" + "Last Name " + "\t" + "Department_ID" + "\t"
				+ "Depertment_Name" + "\t" + "Yerly_Salary" + "\t" + "Yearly_Bonus_10%");

		while (rSet.next()) {
			// Employee_ID First_Name Last_Name Department_ID Depertment_Name Yerly_Salary
			// Yearly_Bonus_10%

			System.out.println(rSet.getString("Employee_ID") + "\t\t" + rSet.getString("First_Name") + "\t\t"
					+ rSet.getString("Last_Name") + "\t\t" + rSet.getString("Department_ID") + " \t\t"
					+ rSet.getString("Depertment_Name") + "\t" + rSet.getString("Yerly_Salary"));

		}

	}

}
