package For;
import java.util.*;

public class BaseAndPower {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //Scanner object
		
		System.out.println("Enter Base :");
		int base = scan.nextInt();
		
		System.out.println("Enter Power :");
		int power = scan.nextInt();
		
		scan.close();
		
		int result =1;
		
		for(int i=1;i<=power;i++) {
			
			result=result * base;
			
		}
		
		System.out.println("result : " +result);
		
	
	}

}
