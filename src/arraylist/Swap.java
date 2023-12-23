package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {

	public static void main(String[] args) {
				ArrayList<String> color = new java.util.ArrayList<>();
						
						color.add("Red");
						color.add("Yellow");
						color.add("Green");
						color.add("Pink");
						color.add("black");
						color.add("brown");
						color.add("Grey");
						
				System.out.println("Origional array : "+color);
				
					Collections.swap(color, 0, 6);
					
					System.out.println("After Swapping : "+color);

	}

}
