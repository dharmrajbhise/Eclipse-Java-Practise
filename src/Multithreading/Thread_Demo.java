package Multithreading;

class Task1 extends Thread{
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Thread 1 :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Task2 extends Thread{
	
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Thread 2 :"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Thread_Demo {
	
	public static void main(String[] args) {
		
		Task1 t1 = new Task1();
		Task2 t2 = new Task2();
		t1.start();
		t2.start();		
	}
}
