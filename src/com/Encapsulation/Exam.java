package com.Encapsulation;

class science{
	private String name;
	private int phymarks;
	private int chemarks;
	private int biomarks;
	
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}
	
	public int getphymarks() {
		return phymarks;
	}
	public void setphymarks(int phymarks) {
		this.phymarks = phymarks;
	}
	
	public int getchemarks() {
		return chemarks;
	}
	public void setchemarks(int chemarks) {
		this.chemarks = chemarks;
	}
	
	public int getbiomarks() {
		return biomarks;
	}
	public void setbiomarks(int biomarks) {
		this.biomarks = biomarks;
	}
	
	public void read() {
		System.out.println("Name of Student : "+name);
		System.out.println("Physics marks : "+phymarks);
		System.out.println("chemistry marks : "+chemarks);
		System.out.println("biology marks : "+biomarks);
		
		
		int total_marks = phymarks+chemarks+biomarks;
		System.out.println("Total marks : "+total_marks);
		float percentage = (total_marks * 100)/300;
		System.out.println("Percentage of pcb : "+percentage);
		if(percentage>=75) {
			System.out.println("First class with distinction");
		}
		else if(percentage>=60) {
			System.out.println("First class");
		}
		else if(percentage>=35) {
			System.out.println("second class");
		}
		else {
			System.out.println("Fail");
		}
	}
}

public class Exam {

	public static void main(String[] args) {
		
		science s1 = new science();
		
		s1.setname("Dharmraj Dilip Bhise");
		s1.setphymarks(85);
		s1.setchemarks(75);
		s1.setbiomarks(90);
		s1.read();

	}

}
