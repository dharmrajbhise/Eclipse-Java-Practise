package Array;

public class MaxinArray {

	public static void main(String[] args) {
		int[] num= {1,2,3,4,5,6,9,4,5,6,10,11,2};
		int min = 0;
		for(int i=0;i<num.length;i++) {
			
			if(num[i]<min) {
				
			 min = num[i];
			}
			System.out.println(min);
		}

	}

}
