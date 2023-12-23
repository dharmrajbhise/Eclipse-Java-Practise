package keyStatic;

class paint{
		int id;
	 static String name = "Dharma" ;
	
	static {						//Static block
		System.out.println("Name of student : "+name);
	}

}

	
public class block {
	
	public static void main(String[] args) {
		
		paint b1 = new paint();
		b1.id = 101;
		System.out.println("id is : "+b1.id);
	}
}
