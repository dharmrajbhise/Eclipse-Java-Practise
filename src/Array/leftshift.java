package Array;
import java.util.*;

public class leftshift {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7,8,9};
		
		int temp = num[0];
		
		for(int i=0;i<num.length-1;i++) {
			
			num[i]=num[i+1];
		}
		num[num.length-1]=temp;
		System.out.println("left-shifted array : "+Arrays.toString(num));

	}

}
