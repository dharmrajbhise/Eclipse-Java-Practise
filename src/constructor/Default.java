package constructor;

class event{
	
	String time;
	String location;
	
	event(){			//Default constructor
		
		System.out.println("constructor called");
	
	}
		
		
}

public class Default {

	public static void main(String[] args) {
		event e1 = new event();
		e1.time="Evening";
		e1.location="Hinjewadi";
		
		System.out.println(e1.time);
		System.out.println(e1.location);

	}

}
