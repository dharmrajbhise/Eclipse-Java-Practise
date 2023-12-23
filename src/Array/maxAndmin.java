package Array;
import java.util.*;

public class maxAndmin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int n = sc.nextInt();
		
		int num[]=new int[n];
		int max=0;
		
		System.out.println("Enter values : ");
		
		for(int i=0;i<num.length;i++) {
			
			num[i]= sc.nextInt();
		}
		
		System.out.println("You entered : ");
		for(int i=0;i<num.length;i++) {
			
			System.out.println(num[i]);
			if(num[i]>i) {
				
				max = num[i];
				
			}
		}
		System.out.println("maximum value : "+max);
		
		sc.close();
		

	}

}
