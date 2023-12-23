package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Copy {

	public static void main(String[] args) {
				ArrayList<String> color = new java.util.ArrayList<>();
						
						color.add("Red");
						color.add("Yellow");
						color.add("Green");
						color.add("Pink");
						color.add("black");
						color.add("brown");
						color.add("Grey");
						
				ArrayList<String> number = new ArrayList<>();
				
						number.add("A");
						number.add("B");
						number.add("C");
						number.add("D");
						number.add("E");
						number.add("F");
						number.add("G");
				
				System.out.println("Before copy : ");
				System.out.println("List 1 : "+color);
				System.out.println("List 2 : "+number);
				
				Collections.copy(color, number);
				
				System.out.println("After copy : ");
				System.out.println("List 1 : "+color);
				System.out.println("List 2 : "+number);
	}

}
