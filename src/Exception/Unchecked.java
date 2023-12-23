package Exception;
import java.util.*;
	//Exception occure in runtime called unchecked exception.
public class Unchecked {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A : ");
		int a = sc.nextInt();
		System.out.println("Enter B : ");	//Enter 0 for Exception
		int b = sc.nextInt();
		
		int c = a/b;
		
		System.out.println("Division : "+c);
		System.out.println("Successfullu running!");
		sc.close();

	}

}
