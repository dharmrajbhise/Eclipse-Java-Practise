package Multithreading;

class Threading extends Thread{
	
	public void run() {
		
		for(int i=0;i<=5;i++) {
			
			System.out.println("Hello java");
		}
	}
}

public class simple {

	public static void main(String[] args) {
		Threading t1 = new Threading();
		
		t1.start();
		
		for(int i=0;i<=5;i++) {
			
			System.out.println("Main Thread");
		}

	}

}
