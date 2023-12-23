package Multithreading;

class hi extends Thread {
	 
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println("hii");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
		
	}
}

class hello extends Thread {
	
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println("Hello");
			try {Thread.sleep(1000);} catch(Exception e) {}
		}
	}
}

public class first {
	
	public static void main(String[] args) {
		
		hi h1 = new hi();
		
		hello h2 =new hello();
		
		h1.start();
		try {Thread.sleep(10);} catch(Exception e) {}
		h2.start();
		
		
	}

}
