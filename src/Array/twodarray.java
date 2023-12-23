package Array;
import java.util.Scanner;

public class twodarray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows: ");
		int m = sc.nextInt();
		System.out.println("Enter columns: ");
		int n = sc.nextInt();
		int num[][]=new int[m][n];
		
		System.out.println("Enter values: ");
		
		for(int i=0;i<num.length;i++) {
			
			for(int j=0;j<num[0].length;j++) {
				
				num[i][j]= sc.nextInt();
			}
		}
		System.out.println("you entered : ");
		for(int i=0;i<num.length;i++) {
			
			for(int j=0;j<num[0].length;j++) {
				
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("array row size : "+num.length);
		System.out.println("array column size : "+num[0].length);
		sc.close();
	}

}
