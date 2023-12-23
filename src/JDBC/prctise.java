package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class prctise {

	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","Bhise@123");
		System.out.println("db connect");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id: ");
		int id = sc.nextInt();
		System.out.println("enter name: ");
		String name = sc.next();
		System.out.println("Enter company name : ");
		String company = sc.next();
		System.out.println("Enter salary : ");
		int salary = sc.nextInt();
		
		PreparedStatement ps = con.prepareStatement("insert into employee values('"+id+"','"+name+"','"+company+"','"+salary+"')");
		ps.executeUpdate();
		System.out.println("Record saved!");
		sc.close();
	}

}
