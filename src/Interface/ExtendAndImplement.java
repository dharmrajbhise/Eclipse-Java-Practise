package Interface;

class grandfather {
	
	String nickname="appa";
	int salary=123545;
	
	public void disp() {
		
		System.out.println("nickname : "+nickname);
		System.out.println("salary : "+salary);
	}
	
}
interface grandmother {
	String nickname = "aai";
	int salary = 0000;
	
	void show();
}

class son extends grandfather implements grandmother {
	
	public void show () {
		
		System.out.println("nickname of mother : "+grandmother.nickname);
		System.out.println("salary of mother : "+grandmother.salary);
	}
	
}



public class ExtendAndImplement {

	public static void main(String[] args) {
		grandfather f1 = new grandfather();
		son s1 = new son();
		s1.show();
		f1.disp();

	}

}
