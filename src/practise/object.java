package practise;

class student {
	public int x=45;
	protected int y=5;
	int z=30;
	private int a=20;
	public void meth1() {
		/*System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);*/
		
	}
	
}
	public class object {
		public static void main(String[] args) {
				student c=new student();
				//c.meth1();
				System.out.println(c.x);
				System.out.println(c.y);
				System.out.println(c.z);
				//System.out.println(c.a);  //error int a is private
				
			
		}
	}
	
