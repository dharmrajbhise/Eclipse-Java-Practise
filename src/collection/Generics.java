package collection;
import java.util.*;

public class Generics {

	public static void main(String[] args) {
		
		List<Integer> num =new java.util.ArrayList<>();
		
		num.add(1232654);
		num.add(2589);
		
		int i = Integer.parseInt(num.get(1).toString());
		System.out.println(i);

	}

}
