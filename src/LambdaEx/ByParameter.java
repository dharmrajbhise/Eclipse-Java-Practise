package LambdaEx;
@FunctionalInterface
interface I {
	void disp(int id, String name);
}


public class ByParameter {

	public static void main(String[] args) {
		I i1 = (int id ,String name) ->
		{
			
			System.out.println("ID : "+id);
			System.out.println("Name : "+name);
			
		};
		i1.disp(2, "Dharma");

	}

}
