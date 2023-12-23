package Array;
import java.util.*;

public class foreach2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integers: ");
		int n = sc.nextInt();
		int num[] = new int[n];
		int marks[];
		marks = num;
		for(int i: marks) {
			
			System.out.println(i);
		}
		sc.close();
	}

}
