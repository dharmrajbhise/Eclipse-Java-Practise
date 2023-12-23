package Inheritance;




public class hierarchical extends sample {

	public static void main(String[] args) {
		
	
	
	hierarchical h1 = new hierarchical();
	
	h1.id = 103256;
	h1.name ="Dharma";
	h1.color = "blue";

	System.out.println(h1.id);
	System.out.println(h1.name);
	System.out.println(h1.color);
	
	try{Thread.sleep(2000);} catch(Exception e) {}
		event e1 = new event();
		
		e1.id = 1236;
		e1.name = "kishor";
		e1.color = "red";
		e1.place = "wanjarkheda";
		e1.Time = "evening";
		e1.mainguest = "Father";
		
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.color);
		System.out.println(e1.place);
		System.out.println(e1.Time);
		System.out.println(e1.mainguest);
	}

}

class event extends sample {
	
	public String place;
	public String Time;
	public String mainguest;
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getTime() {
		return Time;
	}
	public void setTime(String time) {
		Time = time;
	}
	public String getMainguest() {
		return mainguest;
	}
	public void setMainguest(String mainguest) {
		this.mainguest = mainguest;
	}
	
	public void what() {
		
		System.out.println("hierarchical");
	}
	
	
	
	
}
