package ForEach;

public class AdditionOfelements {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7,8,9,10};
		int total = 0;
		
		for(int i:num) {
			
			total=total+i;
			System.out.println(i);
		}
		System.out.println("Total = "+total);

	}

}
