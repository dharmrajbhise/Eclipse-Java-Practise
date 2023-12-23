package Array;
import java.util.*;

public class rightshift {

	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7,8,9};
		
		int temp = num[num.length-1];
		
		System.out.println("original array : "+Arrays.toString(num));
		
		for(int i=num.length-1;i>0;i--) {
			
			num[i]=num[i-1];
		}
		num[0]=temp;
		System.out.println("right-shifted array : "+Arrays.toString(num));

	}

}
