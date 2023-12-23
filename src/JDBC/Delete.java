package JDBC;
import java.sql.*;

public class Delete {
	
	public static void main(String[] args) throws  ClassNotFoundException , SQLException {
		
		String URL = "jdbc:mysql://localhost:3306/employee";
		String Name = "root";
		String Pass = "Bhise@123";
		String Query = "Delete from emp_info where emp_id=106";
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //register driver
		
		Connection conn = DriverManager.getConnection(URL,Name,Pass);  //create connection
		
		Statement stmt = conn.createStatement();  //create statement
		
		int count = stmt.executeUpdate(Query); //execute query
		
		System.out.println(count+ " rows affected");  //process responce
		
		stmt.close();		//Close
		conn.close();
		
		
	}
	

}
