package arraylist;

import java.util.ArrayList;

public class UpdateList {

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
				
				color.set(0, "orange");
				color.set(6, "Red");
				color.set(3, "Grey");
				
				System.out.println("Updated List : "+color);

	}

}
