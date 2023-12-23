package Array;
import java.util.*;

public class sum {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter size of an array : ");
			int a = sc.nextInt();
			int num[]= new int [a];
			int sum =0;
			
			System.out.println("Enter values of array:");
			for(int i=0;i<num.length;i++) {
				
				num[i]=sc.nextInt();
				
			}
			System.out.println("You entered: " );
			for(int i=0;i<num.length;i++) {
				
				sum = sum + num[i];
				
				System.out.println(num[i]);
			}
			System.out.println("sum : "+sum);
			sc.close();
	}

}
