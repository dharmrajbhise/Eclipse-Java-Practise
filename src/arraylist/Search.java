package arraylist;

import java.util.ArrayList;

public class Search {

	public static void main(String[] args) {

			ArrayList<String> color = new java.util.ArrayList<>();
					
					color.add("Red");
					color.add("Yellow");
					color.add("Green");
					color.add("Pink");
					color.add("black");
					color.add("brown");
					color.add("Grey");
					
					if(color.contains("Pink")) {
						System.out.println("Pink is present in list.");
					}
					else {
						System.out.println("Pink is not present");
					}
					
					System.out.println("Origional list : "+color);
	}

}
