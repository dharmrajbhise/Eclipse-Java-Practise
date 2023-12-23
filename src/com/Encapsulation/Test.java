package com.Encapsulation;

class solution {
	
	private int length;
	private int breadth;
	
	public solution(int length,int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getlength() {
		return length;
	}
	
	public void  setlength(int length) {
		this.length = length;
	}
	
	public int getbreadth() {
		return breadth;
	}
	
	public void setbreadth(int breadth) {
		this.breadth = breadth;
	}
}


public class Test {

	public static void main(String[] args) {
		
		solution s1 = new solution(20,90);
		 s1.setlength(20);
		 s1.setbreadth(90);
		 
		 int area = s1.getlength()*s1.getbreadth(); 
		 
		 System.out.println("Area is "+area);

	}

}
