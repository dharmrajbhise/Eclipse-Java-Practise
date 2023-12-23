package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {

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
					
					Collections.shuffle(color);
					
					System.out.println("After shuffling : "+color);

	}

}
