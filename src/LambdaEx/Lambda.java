package LambdaEx;

@FunctionalInterface
interface Factory {
	
	void show();
	
}


public class Lambda {

	public static void main(String[] args) {
		Factory f1 = () -> System.out.println("Hiii Lambda!");
		
		f1.show();

	}

}
