package Inheritance;

class notebook extends Single {
	
	public String type;
	public String brand;
	public String length;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	
	public void print() {
		
		System.out.println("sample class Extends");

	}
}


public class Multilevel {
	
public static void main(String[] args) {
		
		notebook n1 = new notebook();
		
		n1.id =10654;
		n1.name ="register";
		n1.color = "red";
		n1.type = "one line";
		n1.brand ="Classmate";
		n1.length = "25 cm";
		
		System.out.println("id is :"+n1.id);
		System.out.println("name is :"+n1.name);
		System.out.println("color is :"+n1.color);
		System.out.println("type is :"+n1.type);
		System.out.println("brand is :"+n1.brand);
		System.out.println("length is :"+n1.length);
		n1.print();
		
	}
	
	

}
