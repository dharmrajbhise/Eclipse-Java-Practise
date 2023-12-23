package While;

public class StringArray {

	public static void main(String[] args) {
		String name = "All students are good.";
		
		String[] sa = name.split(" ");
		int i=0;
		int j=sa.length-1;
		String temp;
		
//		while(i<j) {
//			
//			temp = sa[i];
//			sa[i]=sa[j];
//			sa[j]=temp;
//			i++;
//			j--;
//			
//		}/
		
		for(i=0;i<j;i++,j--) {
			
			temp = sa[i];
			sa[i]=sa[j];
			sa[j]=temp;
		}
		for(int k=0;k<sa.length;k++) {
		System.out.println(sa[i]+" ");
		}
	}

}
