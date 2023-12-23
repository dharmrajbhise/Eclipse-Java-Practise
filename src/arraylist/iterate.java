package arraylist;
import java.util.*;

public class iterate {

	public static void main(String[] args) {
		
		ArrayList<String> mobiles = new ArrayList<>();
		
		mobiles.add("Nokia");
		mobiles.add("Redmi");
		mobiles.add("Realme");
		mobiles.add("samsung");
		mobiles.add("Apple");
		mobiles.add("jio");
		mobiles.add("spice");
		mobiles.add("One-Plus");
		mobiles.add("metorola");
		
		System.out.println("Mobile Brands : ");
		for(String i : mobiles) {
			
			System.out.println(i);
		}
		

	}

}
