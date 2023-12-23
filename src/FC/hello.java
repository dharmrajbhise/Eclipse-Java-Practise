package FC;
import java.util.*;


public class hello {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Days :");
		
		int days = scan.nextInt();
		int year = days/365;
		int rem1 = days%365;
		System.out.println(year);
		System.out.println(rem1);
		scan.close();
	}

}
