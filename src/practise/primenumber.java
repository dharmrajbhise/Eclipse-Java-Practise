package practise;

public class primenumber {

	public static void main(String[] args) {

		int n=20,count ;
		
		for(int i=1;i<=20;i++) {
			
			count=0;
			for(int j=2;j<=i/2;j++) {
				
				if(i % j==0) {
					count++;
					break;
				}
			}
			
			if(count == 0) {
				System.out.println(i);
			}
		}
	}

}
