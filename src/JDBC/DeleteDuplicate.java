package JDBC;
import java.sql.*;

public class DeleteDuplicate {

	public static void main(String[] args) throws ClassNotFoundException {
		
		String URL ="jdbc:mysql://localhost:3306/employee";
		String Name = "root";
		String Pass = "Bhise@123";
		String Query = "";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");  //register driver
		
		Connection conn= DriverManager.getConnection(URL,Name,Pass); //create connection
		
		Statement st = conn.createStatement(); //create statement
		
		ResultSet rs = st.executeQuery(Query);
		while(rs.next())
		{
		String name = rs.getInt("emp_id")+ ": "+rs.getString("emp_name")+": "+rs.getString("emp_dep")+": "+rs.getInt("emp_salary");
		
			System.out.println(name);
		}
		catch(Exception e)
		{
			System.err.println("Error");
			}
		}
		
		
	}

}
