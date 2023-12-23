package Array;

public class Jaggedarray1 {

	public static void main(String[] args) {
		
		int num[][]= new int[3][];
		
		
		int[] num1= {12,15,18,17,20,17};
		int[] num2= {24,25,26};
		int[] num3= {36,37,38,40};
		num[0]=num1;
		num[1]=num2;
		num[2]=num3;
//		num[0][0]=12; 
//		num[0][1]=15;
//		num[0][2]=18;
//		num[0][3]=17;
//		num[0][4]=20;
//		num[0][5]=17;
	
//		num[1][0]=24;
//		num[1][1]=2
//		num[1][2]=40;
//		
//		num[2][0]=36;
//		num[2][1]=37;
//		num[2][2]=38;
//		num[2][3]=40;
		
		System.out.println("you entered: ");
		
		for(int i=0;i<num.length;i++) {
			
			for(int j=0;j<num[i].length;j++) {
				
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}

	}

}
