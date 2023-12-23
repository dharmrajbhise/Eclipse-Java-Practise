package FC;
import java.util.*;

public class evenodd {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no :");
		int num = scan.nextInt();
		scan.close();
		
		if(num%2==0) {
			
			System.out.println("even no");
		}
		else {
			
			System.out.println("odd no");
		}
	}

}
