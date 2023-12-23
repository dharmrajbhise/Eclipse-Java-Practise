package Patterns;
import java.util.*;

public class Pyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows : ");
		int n = sc.nextInt();
		for(int i=0;i<=n;i++) {
			
			for(int j=0;j<=2*n-1;j++) {
				if(j>= n - i  && j<= n + i) {
				System.out.print("*");
				}
				else {
				System.out.print(" ");
				}
			}
			System.out.println();
			sc.close();
			
		}
		
	}

}
