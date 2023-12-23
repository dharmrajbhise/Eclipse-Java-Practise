package Interface;

class Teacher{
	String name = "Kadam sir";
	String school ="JVM";
	
	public void disp() {
		System.out.println("name of teacher :"+name);
		System.out.println("school of teacher :"+school);
	}
}

class student extends Teacher {
	String name = "dharma";
	String school ="JVM";
	
	public void show() {
		System.out.println("name of student : "+name);
		System.out.println("school of student : "+school);
	}
}

interface parent{
	public static final String name="Dilip Bhise";
	String school = "ZPPS";
	
	void watch();
}

class clark extends student implements parent {
	
	public void watch() {
		System.out.println("name of parent : "+parent.name);
		System.out.println("name of school : "+parent.school);
	}
}
public class HybridInheritance {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		student s1 = new student();
		clark c1 = new clark();
		
		t1.disp();
		s1.show();
		c1.watch();
		
		
		

	}

}
