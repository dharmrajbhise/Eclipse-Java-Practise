package practise;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		int number = 100;
		String padded = String.format("%03d" , number);
		 System.out.println(padded);
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<=2;i++){
                String s1=sc.nextLine();
                int x=sc.nextInt();
                
                for(int j=0;j<1;j++) {
                    if(x<100 && x>50){
                        System.out.println(s1+"           "+"0"+x);
                    }
                    else if(x==50) {
                    	System.out.println(s1+"         "+"0"+x);
                    }
                    else{
                System.out.println(s1+"          "+x);
                    }
                    
                }
            }
            System.out.println("================================");

    }

	}


