package FC;

class Test {
	public int length;
	public int breadth;
	
	public Test(int m,int n) {
		
		length = m;
		breadth = n;
	}
	
	public void show(){
		
		int new_Area = length * breadth;
		System.out.println("Area is : "+new_Area);
	}
}

public class Constructor {

	public static void main(String[] args) {
		
		Test t1 = new Test(20,30);
		t1.show();

	}

}
