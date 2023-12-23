package FC;

class Loops{
	
	public void forLoop() {
		
		for(int i=0;i<5;i++) {
			
			System.out.println("Hello Java");
		}
		
	}
	
	public void  IFElse(){
		int n = 20;
		if(n%2==0) {
			System.out.println("even no");
		}
		else {
			System.out.println("Odd no.");
		}
		
		
	}
	
	public void IFELSELADDER() {
		int num = 12;
		if (num<0) {
					
					System.out.println("negative");
				}
				else if(num>0) {
					
					System.out.println("positive");
				}
				else {
					
					System.out.println("equal");
				}
	}
	
	public void While() {
		
		int i =0;
		while(i<=5) {
			
			System.out.println("Hello");
			i++;
		}
	}
	
	public void DoWhile() {
		int i=0;
		do {
			System.out.println("Hello World");
			i++;
		}while(i<=5);
		
	}
	
	public void Switch() {
		int choice =1;
		
		switch(choice) {
		
		case (1):
			forLoop();
		break;
		
		case (2):
			IFElse();
		break;
		
		case (3):
			IFELSELADDER();
		break;
		
		case (4):
			While();
		break;
		
		case (5):
			DoWhile();
		break;
		
		default :
			System.out.println("Invalid");
		}
	}
		
}


public class ClassAndObject {

	public static void main(String[] args) {
		
		Loops L1 = new Loops();
		L1.forLoop();
		L1.IFElse();
		L1.IFELSELADDER();
		L1.While();
		L1.DoWhile();
		L1.Switch();
		
		

	}

}
