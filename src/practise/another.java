package practise;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import com.mysql.jdbc.Driver.PreparableStatement;

public class another {
	
	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		
		int id;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the id");
		id = 11;
		System.out.println("Please enter your Name");
		name = "swapnil";
		sc.close();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Bhise@123");
		
		PreparedStatement stmt = connection.prepareStatement("insert into studentinfo values(?,?)");
		
		stmt.setInt(1, id);
		stmt.setString(2, name);
		int result = stmt.executeUpdate();
		
		String query = "select * from studentinfo";
		
		Statement stm = connection.createStatement();
		ResultSet rs = stm.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getString(2));
		}
		// executeupdate*
//		stmt.setInt(1, id);
//		stmt.setString(2, name);
//		int result = stmt.executeUpdate();
//		ResultSet rs=stmt.executeQuery();
//		rs.next();
//		System.out.println(rs.getString(2)+ rs.getInt(1));
		
		
		
	}

}
