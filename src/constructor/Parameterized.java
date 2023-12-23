package constructor;

class dog {
	
	String color;
	String name;
	
	dog(int a,int b){
		
		int x = a;
		int y = b;
		int z = x+y;
		
		System.out.println("Total = "+z);
		System.out.println("constructor called");
		
		
	}
}



public class Parameterized {

	public static void main(String[] args) {
		dog d1 = new dog(20,30);
		
		d1.color="Black";
		d1.name="paddy";
		
		System.out.println("Dog color : "+d1.color);
		System.out.println("Dog name : " +d1.name);

	}

}
