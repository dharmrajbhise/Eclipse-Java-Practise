package Array;
import java.util.*;

public class sorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of A:");
		int a = sc.nextInt();
		int x[]= new int[a];
		System.out.println("Enter size of B: ");
		int b = sc.nextInt();
		String y[]= new String[b];
		
		System.out.println("Enter Array A: ");
		for(int i=0;i<x.length;i++) {
			
			x[i]=sc.nextInt();
		}
		
		System.out.println("Enter Array B: ");
		for(int i=0;i<y.length;i++) {
			
			y[i]=sc.next();
		}
		System.out.println("Origional array : "+Arrays.toString(x));
		Arrays.sort(x);
		System.out.println("sorted array: "+Arrays.toString(x));
		
		System.out.println("origional array : "+Arrays.toString(y));
		Arrays.sort(y);
		System.out.println("Sorted array : "+Arrays.toString(y));
		
		sc.close();
		
		
		
		

	}

}
