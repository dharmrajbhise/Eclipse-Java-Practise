package methodovrriding;

class parent {
	
	void show() {
		
		System.out.println("Parent's show");
	}
}

class child extends parent {
	
	void show() {
		
		super.show();
		System.out.println("child's show");
	}
}

public class Super {

	public static void main(String[] args) {
		
		child c1 = new child();
		
		c1.show();

	}

}
