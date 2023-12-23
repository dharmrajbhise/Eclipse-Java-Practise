package com.classes;
import java.util.*;

public class student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Marathi =");
		int a= sc.nextInt();
		System.out.println("Hindi =");
		int b= sc.nextInt();
		System.out.println("English =");
		int c= sc.nextInt();
		System.out.println("history =");
		int d= sc.nextInt();
		System.out.println("Math =");
		int e= sc.nextInt();
		System.out.println("Science =");
		int f= sc.nextInt();
		int tot = total_marks(a,b,c,d,e,f);
		double avg = avg_marks(tot,6);
		sc.close();
		
		System.out.println("The total marks is " +tot+" The avg Marks is "+avg);

	}
	
		public static int total_marks(int Marathi,int Hindi,int English,int history,int Math,int Science) {
			int total = Marathi + Hindi + English + history + Math + Science;
			return total;
			
		}
		
		public static double avg_marks(int total,int no_sub) {
			double avg = total/no_sub;
			return avg;
			
		}

}
