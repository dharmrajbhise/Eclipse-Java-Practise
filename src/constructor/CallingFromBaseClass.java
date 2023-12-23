package constructor;

class home{
	
	public int Id;
	public String Name;
	
	home(int x,String y){
		
		this.Id = x;
		this.Name = y;
		
		System.out.println("Id is "+Id);
		System.out.println("Name is "+Name);
		
	}
	
}

class Dad extends home{
	
	Dad(int x,String Name){
		
		super(101,"Dharma");
		System.out.println("Id is "+Id);
		System.out.println("Name is "+Name);
	}
}


public class CallingFromBaseClass {

	public static void main(String[] args) {
		
		Dad d1 = new Dad(102,"Kishor");

	}

}
