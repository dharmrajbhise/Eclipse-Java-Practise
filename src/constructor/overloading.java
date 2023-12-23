package constructor;

class human{
	
	String name;
	
	human(int Age,String name){
		
		System.out.println("Age of human : "+Age);
		System.out.println("Name of human : "+name);
	}
	human(String location,String Surname){
		
		System.out.println("Location of human : "+location);
		System.out.println("surname of human : "+Surname);
		
	}
	human(String ocupation){
		
		System.out.println("Ocupation of human : "+ocupation);
		
	}
	
}



public class overloading {
	
	public static void main(String[] args) {
		
		human h1 = new human("Pune","Bhise");	//second constructor
		
		human h2 = new human(25,"Dharmraj");	//First constructor
		
		human h3 = new human("Full stack Developer");    //Third constructor
	}

}
