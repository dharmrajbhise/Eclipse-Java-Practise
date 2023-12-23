package Array;
import java.util.*;

public class InsertAnElement {

	public static void main(String[] args) {
		int num[]= {11,22,33,44,55,66,77,88,99};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter index position: ");
		int x = sc.nextInt();
		System.out.println("Enter new value : ");
		int new_value = sc.nextInt();
		
		System.out.println("original array: "+Arrays.toString(num));
		
		for(int i=num.length-1;i>x;i--) {
			
			num[i]=num[i-1];
			
		}
		num[x]=new_value;
		
		System.out.println("New array: "+Arrays.toString(num));
		sc.close();
		

	}

}
