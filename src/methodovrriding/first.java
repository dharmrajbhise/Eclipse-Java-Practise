package methodovrriding;


class event {
	
	
	public void location(){
		
		System.out.println("Location is : Pune");
	}
	
}

class Auto extends event{

	public void location() {
		
		String location ="Latur";
		
		System.out.println("loction is : "+location);
	}
}

class Truck extends event{
	
	public void location() {
		
		String location = "Kalewadi";
		
		System.out.println("location is : "+location);
	}
}
public class first {
	
	public static void main(String[] args) {
		
		event e1 = new event();
		Auto a1 = new Auto();
		Truck t1 = new Truck();
		e1.location();
		a1.location();
		t1.location();
		
		
	}

}
