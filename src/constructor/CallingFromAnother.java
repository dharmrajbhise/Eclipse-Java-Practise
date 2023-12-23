package constructor;

class Inner {
	
	 Inner() {
		
		System.out.println("Constructor Called!");
	}
	
	Inner(int x){
		
		this();
		System.out.println(x);
	}
	
	Inner(int x,float y){
		
		this(5);
		System.out.println(x+y);
	}
	
	Inner(float x,float y){
		
		this(5,10);
		System.out.println(x+y);
	}
}
public class CallingFromAnother {

	public static void main(String[] args) {
		
		Inner i1 = new Inner(2.5f,3.5f);

	}

}
