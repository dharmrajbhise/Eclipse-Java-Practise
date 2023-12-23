package While;
import java.util.*;

public class tables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter table no.");
		int n = sc.nextInt();
		int i=1;
		
		while(i<=10) {
			
			System.out.println(n*i);
			i++;
		}
		sc.close();
	}

}
