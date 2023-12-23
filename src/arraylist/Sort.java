package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
			ArrayList<String> color = new java.util.ArrayList<>();
					
					color.add("red");
					color.add("yellow");
					color.add("green");
					color.add("pink");
					color.add("black");
					color.add("brown");
					color.add("grey");
					
					System.out.println("Original List : "+color);
					
					Collections.sort(color);
					
					System.out.println("After sorting : "+color);

	}

}
