package For;
import java.util.*;

public class Factorial {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n = sc.nextInt();
		int fact = 1;
		sc.close();
		
			for(int j=1;j<=n;j++) {
			fact=fact*j;
		
			}
			System.out.println(n+":" +fact);
			
	}

}
