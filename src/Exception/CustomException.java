package Exception;
import java.util.*;
	//enter withdraw amount greater than 10000 to see exception
class LowBalanceException extends RuntimeException {
	
	public LowBalanceException() {
	super("Insufficient Balance");
	}
}

class exception{
	
	public void atm(int m) throws LowBalanceException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Withdraw amount : ");
		int withdraw = sc.nextInt();
		int Balance = m;
		
		if(withdraw>Balance) {
			
			throw new LowBalanceException();
		}
		else {
			
			int remain = Balance - withdraw;
			try{Thread.sleep(1500);} catch(Exception e) {}
			System.out.println("Take it!");
			System.out.println("Remaining Balance : "+remain);
		}
		
		
	}
}

public class CustomException {

	public static void main(String[] args) {
		
		exception e1 = new exception();
		try {
		e1.atm(10000);
		}
		catch(LowBalanceException e) {
			
			System.out.println(e);
		}
		
		



	}

}
