package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class reverse {

	public static void main(String[] args) {
		
				ArrayList<String> color = new java.util.ArrayList<>();
						
						color.add("Red");
						color.add("Yellow");
						color.add("Green");
						color.add("Pink");
						color.add("black");
						color.add("brown");
						color.add("Grey");
						
						System.out.println("Origional list : "+color);
						
						Collections.reverse(color);
						
						System.out.println("reverse list : "+color);

	}

}
