package collection;
import java.util.*;

public class CollectionGenerics {

	public static void main(String[] args) {
		
		Collection<Integer> num= new java.util.ArrayList<>();
		
		num.add(256);
		num.add(23);
		num.add(215698);
		
//		Iterator e = num.iterator();
		
		num.remove(23);
		
//		while(e.hasNext()) {
//		System.out.println(e.next());
//		}

		for(int i : num) {			//for-each 
			
			System.out.println(i);
		}
	}

}
