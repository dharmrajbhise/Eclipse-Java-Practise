package Multithreading;

class tasko implements Runnable{
	
	public void run() {
		
		for(int i=0;i<=10;i++) {
			
			System.out.println("Thread : "+i);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}	
		}	
	}
}

public class Thread_Runnable {
	
	public static void main(String[]args) {
		
		tasko t1 = new tasko();
		Thread tn = new Thread(t1);
		Thread tn1 = new Thread(t1);
		tn.start();
		tn1.start();
	}
}
