package Exception;

public class handling {
	
	public static void main(String[] args) {

		//Exception handling using try and catch
		try 
		{
			int i[]=new int[8];
			i[8]=4;
	//at 8th position element is not Present hence ArrayIndexOutOfBoundsExceptionException
			int a = 1;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)	//multiple exceptions
		{
		
			System.out.println("Error");
			
		}
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("stay in limit...");
		}*/
		
		
		System.out.println("bye");
	}

}
