package Interface;

interface Father{
	
	int a = 10;
	int b = 20;
	
	void add();
}

interface Mother{
	
	int c = 20;
	int d = 50;
	void add();
	
}

interface kid {
	
	int e = 80;
	int f = 20;
	
	 void add(); 
		
		
}

class tally implements kid , Father , Mother{
	
	public void add() {
	int x = a+b;
	int y = c+d;
	int z = e+f;
	System.out.println("Result of Father : "+x);
	System.out.println("Result of Mother : "+y);
	System.out.println("Result of son : "+z);
	}
	
}

public class extendInterface {

	public static void main(String[] args) {
		
		tally t1 = new tally();
		
		t1.add();
		

	}

}
