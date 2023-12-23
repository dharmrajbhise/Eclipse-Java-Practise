package com.classes;


class car {
	String color;
	String body;
	String fuel;
	String Wheels;
	
	public void printinfo() {
		System.out.println(this.color);
		System.out.println(this.body);
		System.out.println(this.fuel);
		System.out.println(this.Wheels);
	}
	
	
}

public class Maruti {
	
	public static void main(String[] args) {
		car c=new car();
		c.color="red";
		c.body="steel";
		c.fuel="CNG";
		c.Wheels="MRF";
		
		car c2=new car();
		c2.color="Blue";
		c2.body="ALuminium";
		c2.fuel="Petrol";
		c2.Wheels="MRF";
		
		
		System.out.println("car1");
		
		c.printinfo();
		
		System.out.println("car2");
		
		c2.printinfo();
		
				
	}

}
