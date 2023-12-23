package constructor;

class man{
	String name;
	String location;
	int age;
	
	man(String x,int y,String z){
		name = x;
		 age = y;
		location = z;
	}
	public man(man m) {
		
		name = m.name;
		age = m.age;
		location= m.location;
	}
	public void info() {
		
		System.out.println("Name of man : "+name);
		System.out.println("Age of man : "+age);
		System.out.println("Location : "+location);
	}
}
public class copy {
	
	public static void main(String[] args) {
		System.out.println("man1 : ");
		man m1 = new man("abc",24,"Pune");
		
		m1.info();
		System.out.println("Man 2:");
		man m2 = new man(m1);
		
		m2.info();
	}
}
