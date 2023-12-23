package Array;

public class StringArray {

	public static void main(String[] args) {
		String num[]= {"Java","Python","C","C++","Ruby"};
		
		System.out.println("you entered : ");
		for(int i=0;i<num.length;i++) {
			
			System.out.println("["+i+"]"+num[i]);
			System.out.println("length of String : "+num[i].length());
		}

	}

}
