package While;
import java.util.*;

public class login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		
		while(true){
		System.out.println("Enter Password : ");
		i = sc.nextInt();

		 if(i==0){
				System.out.println("Logged in Successfully");
				break;
			}
			 System.out.println("Invalid");
		}
		sc.close();
		

	}

}
