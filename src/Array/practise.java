package Array;
import java.util.*;

public class practise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no.of elements : ");
		int n = sc.nextInt();
		int i;
		int num[] = new int[n];
		System.out.println("Enter integers :");
		for( i=0;i<n;i++) {
		num[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++) {
		
		System.out.println( "number"+"["+i+"]"+" = "+num[i]);
		}
		System.out.println("size of array : "+num.length);
		sc.close();
	}

}
