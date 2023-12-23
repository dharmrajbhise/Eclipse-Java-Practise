package methodOverloading;

//More than one method with same name is defined in same class

class event {
	
	public void add(int a,int b) {
		
		System.out.println(a+b);				//1st method
	}
	
	public void add(String name,int id) {
		
		System.out.println(name +" : "+ id);		//2nd method
	}
	
	public void add(float weight,int age) {
		
		System.out.println(weight+" & "+age);		//3rd method
	}
}

public class byTypeOfParameter {

	public static void main(String[] args) {
		event e1 = new event();
		
		e1.add(61.20f,35);		//3rd method
		
		e1.add(20,30);			//1st method
		
		e1.add("Dharma",103 );	//2nd method

	}

}
