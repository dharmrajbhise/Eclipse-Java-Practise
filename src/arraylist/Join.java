package arraylist;

import java.util.ArrayList;

public class Join {

	public static void main(String[] args) {
				ArrayList<String> color = new java.util.ArrayList<>();
						
						color.add("Red");
						color.add("Yellow");
						color.add("Green");
						color.add("Pink");
						color.add("black");
						color.add("brown");
						color.add("Grey");
						
				ArrayList<String> number = new ArrayList<>();
				
						number.add("1");
						number.add("2");
						number.add("3");
						number.add("4");
						number.add("5");
						number.add("6");
						number.add("7");
						number.add("8");
						
						System.out.println("List 1 : "+color);
						System.out.println("List 2 : "+number);
						
					ArrayList<String> add = new ArrayList<>();
					
					add.addAll(color);
					add.addAll(number);
					
					System.out.println("After Join : "+add);
	}

}
