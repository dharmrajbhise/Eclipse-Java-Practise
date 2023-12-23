package collection;

public class ArrayList {

	public static void main(String[] args) {

		java.util.ArrayList<Integer> a1 = new java.util.ArrayList<>();
		
			a1.add(123644);
			a1.add(2589);
			a1.add(2584);
			a1.add(236541);
			a1.add(14785);
			a1.add(14785);
			a1.add(14785);
			a1.add(12546);
			
			System.out.println("Size of ArrayList : "+a1.size());
			
			
			for(int i : a1) {
				System.out.println(i);
			}
	}

}
