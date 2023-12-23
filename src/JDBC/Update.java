package JDBC;
import java.sql.*;
import java.util.*;

public class Update {

	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Bhise@123");
		System.out.println("DB connect");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id : ");
		int id = sc.nextInt();
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Enter company : ");
		String company = sc.next();
		PreparedStatement ps = con.prepareStatement("UPDATE employee SET name=('"+name+"') , company=('"+company+"') where id=('"+id+"')");
		
//		int i = ps.executeUpdate();
//		if(i>0) {
//		System.out.println("Done!");
//		}
//		else {
//			System.out.println("fail");
//		}
		ps.executeUpdate();
		System.out.println("Data Updated!");
		
		sc.close();

	}

}
