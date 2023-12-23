package Multithreading;

class Mythread implements Runnable {
	
	public void run() {
		for(int i=0;i<=5;i++) {
		System.out.println("run");
		}
	}
}


public class ExtendingInterface {

	public static void main(String[] args) {
		Mythread m1 = new Mythread();
		Thread t1 = new Thread(m1);
		t1.start();
		for(int i=0;i<=5;i++) {
			
			System.out.println("Main thread");
		}

	}

}
