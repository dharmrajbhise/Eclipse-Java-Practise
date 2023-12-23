package Inheritance;

public class sample {
	
	public int id;
	public String name;
	public String color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showme() {
		
		System.out.println("Extends");
	}
	
}
