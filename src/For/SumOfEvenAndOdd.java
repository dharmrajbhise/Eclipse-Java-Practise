package For;
import java.util.*;

public class SumOfEvenAndOdd {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter the no :");
		int number = scan.nextInt();		
		int evensum=1;
		int oddsum=1;
		
		scan.close();
		
		for(int i=0;i<=number;i++) {
			
			if(number%2==0) {
			evensum=i+number;
			
			
			}
			if(number%2!=0) {
				oddsum=i+number;
				
				
			}
			System.out.println("evensum : "+evensum);
			System.out.println("oddsum : "+oddsum);
		}
		
	}

}
