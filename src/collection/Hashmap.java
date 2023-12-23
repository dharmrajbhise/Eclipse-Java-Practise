package collection;
import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer, String> num = new HashMap<>();
		
		num.put(1, "Dharmraj");
		num.put(2, "Kishor");
		num.put(3, "Sudarshan");
		num.put(4, "Aditya");
		num.put(5, "Nikhil");
		num.put(6, "Amar");
		num.put(7, "Vicky");
		num.put(8, "Vinayak");
		num.put(9, "Anant");
		
		System.out.println("Friend circle : ");
		
		for(Map.Entry<Integer, String> i : num.entrySet()) {
			
			System.out.println(i.getKey()+"."+i.getValue());
		}
				
		
	}
		
}
