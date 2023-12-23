package keyStatic;

class demo {
		public int id;
		public String name;
		static public String company = "TCS";
		
		
		public static void display() {
			
			System.out.println("id of emp :"+company);
		}
		
}
public class method {
	
	public static void main(String[] args) {
		
		demo d1 = new demo();
		d1.id = 101;
		d1.name = "dharma";
		
		System.out.println("empid :"+d1.id);
		System.out.println("empname : "+d1.name);
		demo.display();
		
	}

}
