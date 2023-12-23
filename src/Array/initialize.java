package Array;

public class initialize {

	public static void main(String[] args) {
		int num[]= {11,22,33,44,55,66,77,88,99,100};
		int mark[];
		
		mark = num;
		
		for(int i=0;i<10;i++) {
			
			System.out.println("number"+"["+i+"] = "+mark[i]);
		}

	}

}
