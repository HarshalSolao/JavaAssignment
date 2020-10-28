package com.assignment.jay;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;  

 
public class JDBC_Connectionn {

	public static void main(String [] args) {
		Connection con = null; 
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");  //creation of driver object
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "root"); //creation of connection object

			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getInt(4)
						+ "  " + rs.getInt(5) + "  " + rs.getString(6) + "  " + rs.getString(7));
			}
			
			//Insert elements
//			String sql = "INSERT INTO student (rollNo, firstName, lastName, age, city, state) VALUES (?,?,?,?,?,?)";
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setInt(1,105);
//			ps.setString(2, "Jay"); 
//			ps.setString(3, "Bhakte");
//			ps.setInt(4,19);
//			ps.setString(5, "Amravati");
//			ps.setString(6, "mh");
//			
//			ps.setInt(1,106);
//			ps.setString(2,"Sanket");
//			ps.setString(3, "More");
//			ps.setInt(4, 19);
//			ps.setString(5, "Amravati");
//			ps.setString(6,"MH");
//		
//			int b = ps.executeUpdate();
//			if(b>0) {
//				System.out.println("Added Successfully");
//			}
//			
			//Update elements
//			String sql = "UPDATE student SET firstName = ? , lastName = ? where id = ?";
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setString(1, "Yash");
//			ps.setString(2, "Chopra");
//			ps.setInt(3, 8);
//			
//			ps.setString(1,"Yash");
//			ps.setString(2, "Ingole");
//			ps.setInt(3, 4);
//			
//			int a = ps.executeUpdate();
//			if (a>0) {
//				System.out.println("UPDATED SUCCESFULLY");
//			}
			
			
			
			
			
			
			
		//Delete elements
//			String sql = "DELETE FROM student where id = ?";
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setInt(1, 7);
//			
//			ps.setInt(1,3);
//			int a = ps.executeUpdate();
//			if (a>0) {
//				System.out.println("DELETED SUCCESFULLY");
//			}
			
			
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
