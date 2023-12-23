package Interface;

interface printable {
	
	public static final int a = 10;
	int b = 123654;
	
	void add();
}

class pen implements printable{
	
	int sum = printable.a+printable.b;
	public void add() {
		
		System.out.println("sum is : "+sum);
	}
}

public class Implementation {

	public static void main(String[] args) {
		pen p1 = new pen();
		
		p1.add();

	}

}
