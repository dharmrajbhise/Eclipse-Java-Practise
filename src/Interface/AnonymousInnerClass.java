package Interface;

@FunctionalInterface
interface A {
	
	void show();

}




public class AnonymousInnerClass {

	public static void main(String[] args) {
		A a1 = new A() {
			
			public void show() {
				System.out.println("Hii");
				}
			};
			a1.show();
		}

	}
