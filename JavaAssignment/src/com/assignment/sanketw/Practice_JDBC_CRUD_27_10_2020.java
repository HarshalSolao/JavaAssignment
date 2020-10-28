package com.assignment.sanketw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.UUID;

public class Practice_JDBC_CRUD_27_10_2020 {

	public static void main(String[] args) {

		
		Connection con = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Root");

			// INSERT STUDENT IN DB
			String sql = "insert into student (firstName, lastName, rollNo, age, city, state) values(?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "Rajesh");
			ps.setString(2, "Kapse");
			ps.setInt(3, 104);
			ps.setInt(4, 45);
			ps.setString(5, "Nagpur");
			ps.setString(6, "Maharashtra");

			int b = ps.executeUpdate();
			if (b > 0) {
				System.out.println("Added Successfully!");
			}

			// UPDATE STUDENT IN DB
//			String sql ="update student set age=? , firstName=? where id=?";
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setInt(1, 50);
//			ps.setString(2, "Avi");
//			ps.setInt(3, 4);
//			int b = ps.executeUpdate();
//			if(b>0)
//			{
//				System.out.println("Updated Successfully!");
//			}

			// DELETE STUDENT IN DB
//			String sql ="delete from student where id=?";
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setInt(1, 4);
//
//			int b = ps.executeUpdate();
//
//			if(b>0)
//			{
//			System.out.println("Deleted Successfully!");
//			}

			
			// TO PRINT STUDENT DB
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
