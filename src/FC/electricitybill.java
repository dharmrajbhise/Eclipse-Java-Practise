package FC;

public class electricitybill {

	public static void main(String[] args) {
		int unit =230;
		double bill= 0;
		
		if(unit<50) {
			
			bill=50*0.50;
		}
		else if(unit<150) {
			
			bill=50*0.50+(unit-50)*0.75;
		}
		else if(unit<250) {
			bill=50*0.50+100*0.75+(unit-150)*1.20;
		}
		else {
			bill=50*0.50+100*0.75+100*1.20+(unit-250)*1.50;
		
		}
			double totalbill = bill*1.2;
			System.out.println(totalbill);
	}

}
