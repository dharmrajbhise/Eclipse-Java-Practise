package FC;
import java.util.*;

public class Ifelse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no :");
		int num=scan.nextInt();
		scan.close();
		if (num<10) {
			
			System.out.println("positive");
		}
		else if(num>0) {
			
			System.out.println("positive");
		}
		else {
			
			System.out.println("equal");
		}

	}

}
