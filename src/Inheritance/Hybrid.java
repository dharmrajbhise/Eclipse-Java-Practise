package Inheritance;


class tv extends sample {
	
	String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	
}

class tree extends sample {
	
	String leavescolor;

	public String getLeavescolor() {
		return leavescolor;
	}

	public void setLeavescolor(String leavescolor) {
		this.leavescolor = leavescolor;
	}
	

}


class door extends tv {
	
	
}

public class Hybrid {
	
	public static void main(String[] args) {
		
	System.out.println("tv :");
	
	tv t1 = new tv();
	
	t1.id = 11479;
	t1.name = "Redmi";
	t1.color = "Black";
	t1.brand = "xiomi";
	
	System.out.println(t1.id);
	System.out.println(t1.name);
	System.out.println(t1.color);
	System.out.println(t1.brand);
	
	try{Thread.sleep(1500);} catch(Exception e) {}
	
	System.out.println("Tree :");
	
	tree t2 = new tree();
	
	t2.id = 13364;
	t2.name = "lemon";
	t2.leavescolor = "green";
	
	System.out.println(t2.id);
	System.out.println(t2.name);
	System.out.println(t2.leavescolor);
	
	
	}

}
