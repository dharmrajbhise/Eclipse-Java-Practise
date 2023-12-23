package Exception;

public class Rethrowing {

	public static void main(String[] args) {
		try {
			
			getdata();
			putdata();
			
		}
		catch(ArithmeticException e) {
			
			System.out.println("Exception Handled");
		}
	}
		
		static void getdata() {
			try {
				
				int a = 100/2;
				System.out.println("Result : "+a);
			}
			catch(ArithmeticException e) {
				
				throw e;
			}
			
		}
		
		static void putdata() {
			try {
				
				int b = 100/0;
				System.out.println("Result : "+b);
			}
			catch(ArithmeticException e) {
				
				throw e;
			}
			
		}

	

}
