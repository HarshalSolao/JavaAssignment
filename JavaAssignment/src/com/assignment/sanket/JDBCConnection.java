package com.assignment.sanket;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JDBCConnection {
	public static void main(String[] args) {
		Connection con = null; 
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Rootpass@123");

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4)
						+ "  " + rs.getInt(5) + "  " + rs.getString(6) + "  " + rs.getString(7));
			}
			

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}


	}

}


