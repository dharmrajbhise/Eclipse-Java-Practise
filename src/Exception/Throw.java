package Exception;

public class Throw {

	public static void main(String[] args) {
		int user_balance = 0;
		
		int transfer_amount = 24000;
		
		if(user_balance<transfer_amount) {
			
			throw new NullPointerException("Amount Exceed!");
		}
		
		
	}

}
