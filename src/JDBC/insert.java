package JDBC;
import java.sql.*; //import package

public class insert {
	
	public static void main(String[] args) throws Exception{
		
		String URL ="jdbc:mysql://localhost:3306/employee";
		String Name = "root";
		String Pass = "Bhise@123";
		String Query = "insert into emp_info values(107,'Priti Bhise','BAMS',80000)";
		
		Class.forName("com.mysql.cj.jdbc.Driver");  //register driver
		
		Connection con = DriverManager.getConnection(URL,Name,Pass); //create connection
		
		Statement st = con.createStatement();  //create statement
		
		int a = st.executeUpdate(Query); //execute update query
		
		System.out.println(a + "rows affected"); //process response
		
		st.close();
		con.close();
		
		
		
		
		
		
		
		
		
		
	}

}
