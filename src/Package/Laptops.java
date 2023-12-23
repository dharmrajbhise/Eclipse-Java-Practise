package Package;

public class Laptops {

	public static void main(String[] args) {

		p1.Dell d1 = new p1.Dell();
		p1.HP h1 = new p1.HP();
		
		
		System.out.println("Dell Laptop : ");
		d1.Processor = "intel";
		d1.Model_no = 1021542;
		d1.show();
		
		System.out.println("HP laptop : ");
		h1.Processor = "Ryzen";
		h1.Model_no = 12584697;
		h1.disp();
		
		
	}

}
