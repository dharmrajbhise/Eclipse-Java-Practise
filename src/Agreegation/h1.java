package Agreegation;

class h2 {
	
	public int id;
	public int age;
	public int birth_year;
	public String name;
	
	h2(int id,int age,int birth_year,String name){
		this.id = id;
		this.age = age;
		this.birth_year = birth_year;
		this.name = name;
	}
	
	public void show(int x,int y,int z,String N) {
		id=x;
		age=y;
		birth_year=z;
		name=N;
		System.out.println("Id : "+id);
		System.out.println("Age : "+age);
		System.out.println("Birth Year : "+birth_year);
		System.out.println("Name : "+name);
	}
}

class h6{
	
	public String Company_name;
	public int empId;
	h2 a1;
	
	public void disp(String Company,int empId) {
		
		System.out.println("Company : "+Company_name);
		System.out.println("Employee Id : "+empId);
		
	}
}
public class h1 {
	
	public static void main(String[] args) {
		
		h6 f1 = new h6();
		
		f1.disp("Mount Blue",1023654);
		f1.a1.show(101,25,1999,"Dharmraj");
		
	}

}
