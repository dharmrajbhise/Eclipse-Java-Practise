package JDBC;
import java.sql.*;

public class Select {

	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Bhise@123");
		System.out.println("DB connected!");
		PreparedStatement ps = conn.prepareStatement("select * from employee");
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())    //process Response
		{
			String name = rs.getInt(1)+ " : " +rs.getString(2)+" "+rs.getString(3)+ " " +rs.getInt(4);
			
			System.out.println(name);
		
		}
		System.out.println("Done!");

	}

}
