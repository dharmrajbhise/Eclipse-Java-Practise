package Exception;



public class MultipleCatch {

	public static void main(String[] args) {
		try {
		int a = 10;
		int b = 0;
		int c = a/b;
		System.out.println(c);
		int num[]=new int[10];
		num[10]=20;
		
		String st = "";

		System.out.println(st.length());
		System.out.println(st);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("Division is not possible");
			System.out.println("Index overflow");
			System.out.println("empty");
		}
		
		
		
		

	}

}
