package Interface;

interface dog{
	
	public static final String name = "Jack";
	
	void disp();
	
}

class Doctor implements dog {
	
	public void disp() {
		System.out.println("Name of dog is "+dog.name);
	}
	
}


public class sample {
	
	public static void main(String[] args) {
		
		Doctor d1 = new Doctor();
		d1.disp();
	}

}
