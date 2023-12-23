package hashmap;

import java.util.HashMap;

public class search {

	public static void main(String[] args) {

		HashMap<String, Integer> pop = new HashMap<>();
		
		pop.put("India", 120);
		pop.put("China", 180);
		pop.put("America", 100);
		pop.put("South Africa", 90);
		pop.put("Indonesia", 60);
		pop.put("Pakistan", 20);
		pop.put("Nepal", 10);
		pop.put("England", 60);
		
		System.out.println(pop);
		
		if(pop.containsKey("Indonesia")) {
			
			System.out.println("Indonesia : "+pop.get("Indonesia"));
		}
		else {
			System.out.println("Not Present");
		}
		

		

	}

}
