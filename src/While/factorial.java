package While;
import java.util.*;

public class factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no : ");
		int n = sc.nextInt();
		int i=n;
		int fact =1;
		
		while(i>0) {
			
			fact = fact * i;
			i--;
		}
		System.out.println(fact);
		sc.close();
		

	}

}
