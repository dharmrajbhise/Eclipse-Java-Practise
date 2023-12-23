package com.Encapsulation;

class Student {
	
	private int roll_no;
	private String name;
	
	public int getroll_no() {
		return roll_no;
	}
	
	public void setroll_no(int roll_no) {
		this.roll_no = roll_no;
	}
	
	public String getname() {
		return name;
	}
	
	public void setname(String name) {
		this.name = name;
	}
}
public class demo {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setroll_no(25);
		s1.setname("Dharmraj");
		
		System.out.println("roll no of student : "+s1.getroll_no());
		System.out.println("name of student : "+s1.getname());

	}

}
