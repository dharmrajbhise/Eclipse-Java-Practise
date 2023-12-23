package While;

public class SumOf1to10 {

	public static void main(String[] args) {
		int i=0;
		int total =0;
		
		while(i<=10) {
			
			total = total+i;
			i++;
		}
		
		System.out.println("sum : "+total);

	}

}
