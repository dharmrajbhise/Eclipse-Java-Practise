package ForEach;

public class with2darray {

	public static void main(String[] args) {
		int num[][]= {{11,22},{33,44},{55,66}};
		
		for(int i[]:num) {
			
			for (int j:i) {
				
				System.out.print(j+" ");
				
			}
			System.out.println();
		}

	}

}
