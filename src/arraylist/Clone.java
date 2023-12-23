package arraylist;

import java.util.ArrayList;

public class Clone {

	public static void main(String[] args) {
		
		ArrayList<String> color = new java.util.ArrayList<>();
				
				color.add("Red");
				color.add("Yellow");
				color.add("Green");
				color.add("Pink");
				color.add("black");
				color.add("brown");
				color.add("Grey");
				
				System.out.println("Origional List : "+color);
				
				ArrayList<String> new_color = (ArrayList<String>)color.clone();
				
				System.out.println("Clone array list : "+new_color);

	}

}
