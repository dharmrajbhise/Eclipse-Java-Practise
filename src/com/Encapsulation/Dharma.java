package com.Encapsulation;
import java.util.*;

public class Dharma {
		private int roll_No ;
		private String name;
		private String dep ;
		public Dharma(int roll_No, String name, String dep) {
			super();
			this.roll_No = roll_No;
			this.name = name;
			this.dep = dep;
		}
		public int getRoll_No() {
			return roll_No;
		}
		public void setRoll_No(int roll_No) {
			this.roll_No = roll_No;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDep() {
			return dep;
		}
		public void setDep(String dep) {
			this.dep = dep;
		}
		
		 public static int totalMarks(int Marathi, int Hindi,int English,int history,int Math,int Science)
		    {
		        int total = Marathi + Hindi + English + history + Math + Science;
		        return total;
		    }
		 public static double avgMarks(int total, int num_subs)
		    {
		        double avg = total / num_subs;
		        return avg;
		    }
		 
		 public static void main(String[] args) {
			 Scanner sc = new Scanner(System.in);
			 System.out.println("enter roll no =");
			 int g = sc.nextInt();
			 System.out.println("enter name =");
			 String h = sc.next();
			 System.out.println("enter department =");
			 String i =sc.next();
			Dharma s1 = new Dharma(g,h,i);
			
		 System.out.println("Roll number of student : " + s1.getRoll_No() + ". The name of student : " + s1.getName() + ". Department of the student : " + s1.getDep() + ".");
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
			
		 int tot = totalMarks(a,b,c,d,e,f);
	        double avg = avgMarks(tot, 6);
	       
	        // printing the output
	        System.out.println("The total marks is = " + tot
	                           + ". The average is = " + avg
	                           + ".");
	        
	        sc.close();
	}
}
