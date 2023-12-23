package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Extract {

	public static void main(String[] args) {
					ArrayList<String> color = new java.util.ArrayList<>();
							
							color.add("Red");
							color.add("Yellow");
							color.add("Green");
							color.add("Pink");
							color.add("black");
							color.add("brown");
							color.add("Grey");
							
					System.out.println("Original list : "+color);
					
					List<String> i=color.subList(0, 3);
					
					System.out.println("Extracted list : "+i);

	}

}
