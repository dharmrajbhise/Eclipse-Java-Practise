package practise;
import java.util.*;

class Stand {
	public int m;
	public int n;
	
	public void Add(int a,int b) {
		
		int c = a + b ;
		System.out.println("Addition is : "+c);
	}
	
	public void Sub(int a ,int b) {
		
		m = a;
		n = b;
		int c = m - n ;
		System.out.println("Substraction : "+c);
	}
	
	public void Mul(int a ,int b) {
		
		m = a;
		n = b;
		int c = m * n ;
		System.out.println("Multiplication : "+c);
	}
	
	public void Div(int a , int b) {
		
		m = a;
		n = b;
		int c = m / n ;
		System.out.println("Division : "+c);
	}
	
	public void Squ(int a) {
		m = a;
		
		int c = m * m ;
		System.out.println("Square is : "+c);
	}
	
	public void cub(int a) {
		
		m = a;
		int c = m * m * m;
		System.out.println("Cube is : "+c);
	}
		
		
}
public class Calculator {

	public static void main(String[] args) {
		Stand s1 = new Stand();
		
		for(int i=0;i<=10;i++) {
		System.out.println("-Enter 1 for Addition");
		System.out.println("-Enter 2 for Substration");
		System.out.println("-Enter 3 for Multiplication");
		System.out.println("-Enter 4 for Division");
		System.out.println("-Enter 5 for Square");
		System.out.println("-Enter 6 for Cube");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no : ");
		int a = sc.nextInt();
		System.out.println("Enter second no : ");
		int b = sc.nextInt();
		
		System.out.println("Enter your choice : ");
		int x = sc.nextInt();
		sc.close();
		
		switch (x) {
		case 1: 
			
			s1.Add(a, b);
			break;
			
		case 2: 
			
			s1.Sub(a, b);
			break;
			
		case 3: 
			
			s1.Mul(a, b);
			break;
			
		case 4: 
			
			s1.Div(a, b);
			break;
			
		case 5: 
			
			s1.Squ(a);
			break;
			
		case 6: 
			
			s1.cub(a);
			break;
		
		default:
			System.out.println("Invalid choice!");
		}
		
		}
		

	}


}
