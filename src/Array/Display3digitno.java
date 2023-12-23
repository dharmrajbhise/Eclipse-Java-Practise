package Array;
import java.util.*;

public class Display3digitno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n= sc.nextInt();
		int num[]= new int[n];
		
		System.out.println("Enter array");
		for(int i=0;i<num.length;i++) {
			
			num[i]=sc.nextInt();
		}
		
		System.out.println("You entered");
		for(int i=0;i<num.length;i++) {
			
			if(num[i]>=100) {
				
				System.out.println("three digit no: "+num[i]);
			}
			System.out.println(num[i]);
			sc.close();
		}

	}

}
