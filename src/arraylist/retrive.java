package arraylist;

import java.util.ArrayList;

public class retrive {

	public static void main(String[] args) {
		
		ArrayList<String> color = new java.util.ArrayList<>();
		
		color.add("Red");
		color.add("Yellow");
		color.add("Green");
		color.add("Pink");
		color.add("black");
		color.add("brown");
		color.add("Grey");
		
		System.out.println(color);
		String first_color = color.get(0);
		System.out.println("First color : "+first_color);
		
		String second_color = color.get(3);
		System.out.println("Second color : "+second_color);
		
	}

}
