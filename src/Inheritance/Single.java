package Inheritance;

class Result {
	
	public int Date;
	public String Day;
	public int Year;
	
	public void show() {
		
		System.out.println("Date : "+Date);
		System.out.println("Day : "+Day);
		System.out.println("Year : "+Year);
	}
}

class exam extends Result{
	
	
}
public class Single {
	
	public static void main(String[] args) {
		System.out.println("Result : ");
		Result r1 = new Result();
		r1.Date = 27;
		r1.Day = "Monday";
		r1.Year = 2022;
		
		r1.show();
		
		System.out.println("Exam : ");
		
		exam e1 = new exam();
		e1.Date = 06;
		e1.Day = "Tuesday";
		e1.Year = 2022;
		
		e1.show();	
	}
}
