package FC;
import java.util.*;

public class fact {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no: ");
		int n = sc.nextInt();
		sc.close();
		int factorial = 1;
		
		for(int i=n;i>0;i--) {
			
			factorial = factorial * i;
		}
		System.out.println(factorial);
	}

}
