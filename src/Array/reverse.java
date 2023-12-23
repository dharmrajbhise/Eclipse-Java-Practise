package Array;

import java.util.Arrays;

public class reverse {

	public static void main(String[] args) {
		int num[]= {11,55,22,66,77,25,33};
		
		for(int i=0;i<num.length;i++) {
			
			for(int j=i+1;j<num.length;j++) {
				
				if(num[i]>num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("sorted array : "+Arrays.toString(num));
		

	}

}
