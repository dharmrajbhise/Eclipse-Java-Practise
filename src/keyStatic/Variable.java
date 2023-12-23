package keyStatic;

class company{
	
		int eid;
		String ename;
		static String cname = "TCS";
		
		company(int eid,String ename){
			
			this.eid = eid;
			this.ename = ename;
		}
		
		public void showdata() {
			
			System.out.println("Employee id is "+eid);
			System.out.println("Employee name is "+ename);
			System.out.println("employee company is "+cname);
		}
				
}

public class Variable {

	public static void main(String[] args) {
		
		company c1 = new company(101,"Dharmraj bhise");
		c1.showdata();
		company c2 = new company(102,"kishor bhise");
		c2.showdata();
		company c3 = new company(103,"Sudarshan bhise");
		c3.showdata();
		

	}

}
