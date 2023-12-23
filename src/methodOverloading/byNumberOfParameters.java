package methodOverloading;


class sample {
	
	public void add(int a,int b,int c) {
		int D = a+b+c;
		System.out.println("Addition : "+D);
	}
	public void add(int a,int b) {
		int c = a+b;
		System.out.println("Addition : "+c);
	}
	public void add(int a) {
		
		int x = 20,y = a;
		int z = x+y;
		System.out.println("Addition : " +z);
	}
	
}


public class byNumberOfParameters {
	public static void main(String[] args) {
		
		sample s1 = new sample();
		
		s1.add(30);		//3rd method
		s1.add(20,30,50);	//1st method
		s1.add(80,100);		//2nd method
		
	}

}
