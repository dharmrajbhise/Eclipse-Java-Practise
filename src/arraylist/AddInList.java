package arraylist;
import java.util.*;

public class AddInList {

	public static void main(String[] args) {
		
			ArrayList<String> color = new java.util.ArrayList<>();
			
			color.add("Red");
			color.add("Yellow");
			color.add("Green");
			color.add("Pink");
			color.add("black");
			color.add("brown");
			color.add("Grey");
			
			color.add(2, "Light Green");
			
			color.add(5, "Blue");
			
			System.out.println(color);

	}

}
