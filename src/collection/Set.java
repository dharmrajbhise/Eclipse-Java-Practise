package collection;
import java.util.*;

public class Set {

	public static void main(String[] args) {
		
		java.util.Set<Integer> num = new TreeSet<>();
		
		num.add(1256);
		num.add(8963);
		num.add(123654);
		num.add(1236985);
		num.add(14789632);
		num.add(1256);     //cannot print duplicate values.
		
		for(int i : num) {
			
			System.out.println(i);
		}

	}

}
