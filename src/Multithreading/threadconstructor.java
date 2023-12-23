package Multithreading;
class Text extends Thread{
	
	public void run() {
		
		System.out.println("Child Thread");
	}
	Text(String name){
		
		super(name);
	}
}
public class threadconstructor {

	public static void main(String[] args) {
		Text t1 = new Text("name");
		t1.start();

	}

}
