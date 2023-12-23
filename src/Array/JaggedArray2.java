package Array;
import java.util.Scanner;

public class JaggedArray2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter Row size: ");
		int m = sc.nextInt();
		int num[][]= new int[m][];
//		System.out.println("Enter elements for n1: ");
//		int n1 = sc.nextInt();
//		System.out.println("Enter elements for n2: ");
//		int n2 = sc.nextInt();
//		System.out.println("Enter elements for n3: ");
//		int n3 = sc.nextInt();
		for(int i=0;i<m;i++) {
			
			System.out.println("NO.of elements in row "+(i+1)+":");
			int n1 = sc.nextInt();
			num[i]=new int[n1];
			
		}
		
		
		System.out.println("Enter values: ");
		for(int i=0;i<num.length;i++) {
			
			for(int j=0;j<num[i].length;j++) {
				
				num[i][j]=sc.nextInt();
			}
			
		}
		System.out.println("you entered: ");
		for(int i=0;i<num.length;i++) {
			
			for(int j=0;j<num[i].length;j++) {
				
				System.out.print(num[i][j]+" ");
			}
			
			System.out.println();
			sc.close();
		}
		

	}

}
