package JDBC;
import java.sql.*;

public class Whole {
	
	public static void main(String[] args) throws Exception {
	
	String URL = "jdbc:mysql://localhost:3306/employee";
	String Name = "root";
	String Pass = "Bhise@123";
	String Query = "select * from emp_info";
	
	Class.forName("com.mysql.cj.jdbc.Driver"); //Register Driver
	
	Connection con = DriverManager.getConnection(URL,Name,Pass); //create connection
	
	Statement st= con.createStatement();  //create statement
	
	ResultSet rs = st.executeQuery(Query); //Execute Query
	
	while(rs.next())    //process Response
	{
		String name = rs.getInt(1)+ " : " +rs.getString(2)+" "+rs.getString(3)+ " " +rs.getInt(4);
		
		System.out.println(name);
	
	}
	
	st.close();   //close
	con.close();
	
	
	
	}

}
