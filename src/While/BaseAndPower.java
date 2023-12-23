package While;
import java.util.*;

public class BaseAndPower {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Base : ");
		int base = sc.nextInt();
		
		System.out.println("Enter Power : ");
		int power = sc.nextInt();
		
		int i=1;
		
		int result =1;
		
		while(i<=power) {
			
			result = result * base;
			i++;
			
		}
		System.out.println("Result : "+result);
		sc.close();
	}

}
