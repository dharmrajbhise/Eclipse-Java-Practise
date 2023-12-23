package JDBC;
import java.sql.*; //import package



public class start {
	
	
	public static void main(String[] args)throws ClassNotFoundException , SQLException{
		
		String URL = "jdbc:mysql://localhost:3306/Student";
		String Name = "root";
		String Pass ="Bhise@123";
		String Query = "Select name from studentinfo";
		
		Class.forName("com.mysql.cj.jdbc.Driver"); //Register driver
		Connection con =DriverManager.getConnection(URL,Name,Pass); //Create connection
		
		Statement stmt = con.createStatement();
		
		ResultSet rs = stmt.executeQuery(Query);
		
		while(rs.next())
		{
		
		String name =rs.getString("name");
		
		System.out.println(name);
		}
		
		stmt.close();
		con.close();
		
		
	}

}

	
