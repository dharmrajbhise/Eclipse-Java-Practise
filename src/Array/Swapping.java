package Array;

public class Swapping {

	public static void main(String[] args) {
		int num[]= {11,22,33,44,55,66,77};
		int i=0;
		int j=num.length-1;
		while(i<j) {
			
			int temp=num[i];
			num[i]=num[j];
			num[j]=temp;
			i++;
			j--;
		}
		for(int k=0;k<num.length;k++) {
			
			System.out.println(num[k]+" ");
		}

	}

}
