package com.classes;

class Pen {
	
	String color;
	String type;
	
	public void write() {
		
		System.out.println("write something");
	}
	
	public void printcolor() {
		System.out.println(this.color);
	}
	
	public void printtype() {
		
		System.out.println(this.type);
	}
	
	
	

}

public class oops {
	
	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.color = "Blue";
		p1.type = "Gel";
		
		Pen p2 = new Pen();
		p2.color ="Red";
		p2.type ="Ball";
		
		
		p1.write();
		p1.printcolor();
		p1.printtype();
		p2.printcolor();
		p2.printtype();
		
	}
}
