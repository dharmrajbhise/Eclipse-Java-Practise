package collection;
import java.util.*;

public class vector {

	public static void main(String[] args) {
		Vector<Integer> v1 = new Vector<>();
		
		v1.add(21);
		v1.add(22);
		v1.add(23);
		v1.add(24);
		v1.add(25);
		v1.add(26);
		v1.add(27);
		v1.add(28);
		v1.add(29);
		v1.add(30);
		v1.add(31);
		
		v1.remove(3);
		
		System.out.println(v1.capacity());
		
		for(int i : v1) {
			
			System.out.println(i);
		}

	}


}
