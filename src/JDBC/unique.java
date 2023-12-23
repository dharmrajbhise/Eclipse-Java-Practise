package JDBC;

import java.sql.*;
import java.util.Scanner;

public class unique {

	public static void main(String[] args)throws SQLSyntaxErrorException {
		try
		{
		
		String URL = "jdbc:mysql://localhost:3306/mydb";
		String Name = "root";
		String Pass = "Bhise@123";
		String Query = "SELECT distinct(name) FROM teachers";
		
		Class.forName("com.mysql.cj.jdbc.Driver");  //register Driver
		
		Connection conn = DriverManager.getConnection(URL,Name,Pass); //Create connection

		Statement stmt = conn.createStatement();  //create statement
		
		ResultSet rs = stmt.executeQuery(Query);  //execute Query
		
		while(rs.next()) {						//Process Response
			
			String name = rs.getString("name");
			
			System.out.println(name);
			
		}
		Scanner  scan = new Scanner(System.in);
		String decision = "yes";
			
		while(decision.equals("yes")) {
		int id = scan.nextInt();
//		scan.next();
		String name = scan.next();
		scan.next();
		PreparedStatement ptmt = conn.prepareStatement("insert into teachers(id, name) values(?,?)");
		ptmt.setInt(1, id);
		ptmt.setString(2, name);
		int result = ptmt.executeUpdate();
		name = scan.nextLine();
		scan.next();
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		
		
		
	}

}
