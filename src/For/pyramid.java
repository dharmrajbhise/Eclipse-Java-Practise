package For;

public class pyramid {

	public static void main(String[] args) {
		int rows = 10;
		int column = rows * 2 - 1;
		
		for(int i=0;i< rows;i++) {
			
			for(int j=0;j<=column;j++) {
				
				if(j>=rows - i && j<=column + i) {
					
					System.out.println("*");
					
				}
				System.out.println(" ");
			}
			System.out.println("\n");
		}

	}

}
