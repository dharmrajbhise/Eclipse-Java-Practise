package Abstract;

abstract class dog {
	String Dinner;
	
	public void eat() {
		
		System.out.println("Eating biscuits");
		
	}
}

class cat extends dog {
	String Dinner = "Mouse";
	
	public void eat() {
		
		System.out.println("cat Eating "+Dinner);
	}
}

class Rabbit extends dog {
	String Dinner = "Grass";
	public void eat() {
		
		System.out.println("Rabbit Eating "+Dinner);
	}
}
public class first {

	public static void main(String[] args) {
		
		cat c1 = new cat();
		Rabbit r1 = new Rabbit();
		
		c1.eat();
		r1.eat();
		

	}

}
