package collection;
import java.util.*;
import java.util.Map;
import java.util.Set;

public class map {

	public static void main(String[] args) {
		
		Map<String,String> num = new HashMap<>();
		
		num.put("Name", "Dharmraj");
		num.put("Status", "single");
		num.put("age", "twenty-five");
		
//		java.util.Set<String> i = map.KeySet();
		
//		for(String key : i) {
//			
//			System.out.println(key+"    "+i.get(key));
//		}
		System.out.println(num.get("Status"));
//		
//		for(Map.Entry<String, String> i :num.entrySet()) {
//			
//			System.out.println(i.getKey()+" : "+i.getValue());
//			
//		}
		
		Set<String> i = num.keySet();
		
		for(String key : i) {
			
			System.out.println(key + " : "+num.get(key));
		}
		
		

	}

	
}
