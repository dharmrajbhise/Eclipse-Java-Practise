package collection;
import java.util.*;

public class ListSort {

	public static void main(String[] args) {
		
		
		List<Integer> num = new java.util.ArrayList<>();
		
		num.add(123654789);
		num.add(123654);
		num.add(12565);
		num.add(4556);
		
		Collections.sort(num);   //sorting the elements
		
		Collections.reverse(num);  //reverse the elements
		
//		num.forEach(System.out::println);
		
		for(int i : num) {
			System.out.println(i);
		}
		
	}

}
