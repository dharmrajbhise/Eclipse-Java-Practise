package Array;
import java.util.*;

public class Additionofeven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size : ");
		int n = sc.nextInt();
		int num[]= new int[n];
		int sum =0;
		System.out.println("Enter array");
		for(int i=0;i<num.length;i++) {
			
			num[i]= sc.nextInt();
			}
		
		System.out.println("you entered: ");
		for(int i=0;i<num.length;i++) {
			
			System.out.println(num[i]);
			if(i%2==0) {
				sum = sum+num[i];
		}
			
		}
		
		System.out.println("sum of even no : "+sum);
		sc.close();

	}

}
