package FC;
import java.util.*;

public class bigsmall {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int a =scan.nextInt();
		int b =scan.nextInt();
		scan.close();
		
		if(a>b) {
			
			System.out.println(a +"is greater");
			System.out.println(b +"is smaller");
		}
		else {
			
			System.out.println(b +"is greater");
			System.out.println(a +"is smaller");
		}

	}

}
