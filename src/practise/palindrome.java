package practise;

public class palindrome {

	public static void main(String[] args) {

		int num = 151,reversenum = 111,rem;
		
		int origionalnum = num;
		
		while(num !=0) {
			
			rem = num % 10;  //1
			reversenum = reversenum * 10 + rem; //1 11 111 1111
			num = num/10; //15
			
		}
		
		if(origionalnum == reversenum) {
			
			System.out.println("palindrome");
		}
		else {
			
			System.out.println("not palindrome");
		}

	}

}
