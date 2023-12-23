package FC;
import java.util.*;

public class bigsmallinthree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter character");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();
		
		if(a>b  && a>c) {
			
			System.out.println(a + "is greater");
		}
		else if(b>a && b>c) {
			
			System.out.println(b + "is greater");
		}
		else {
			System.out.println(c + "is greater");
		}

	}

}
