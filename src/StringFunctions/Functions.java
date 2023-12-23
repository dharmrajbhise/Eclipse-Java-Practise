package StringFunctions;



public class Functions {

	public static void main(String[] args) {
		
		String name = "Hello World";
		String name1 = "Welcome";
		
		System.out.println("Origional string : "+name);
		
		System.out.println("Uppercase : "+name.toUpperCase());
		
		System.out.println("Lowercase : "+name.toLowerCase());
		
		System.out.println("Remove spaces : "+name.trim());
		
		System.out.println("character at 1 : "+name.charAt(1));
		
		System.out.println("Index of o : "+name.indexOf('o'));
		
		System.out.println("equality : "+name.equals(name1));
		
		System.out.println("Meaning equality : "+name.equalsIgnoreCase(name1));
		
		System.out.println("Replace world to java : "+name.replace("World", "Java"));
		
		System.out.println("No.of characters : "+name.length());
		
		System.out.println("characters from index no.2 : "+name.substring(2));
		
		System.out.println("Characters between 2 to 5 : "+name.substring(2,5));
		
		System.out.println("add name and name1 : "+name.concat(name1) );
		
		String[] name2 = name.split(" ");
		
		for(int i=0;i<name2.length;i++) {
			
			System.out.println("Split two words : "+name2[i]);
		}
		
		char[] name3 = name.toCharArray();
		
		for(int i=0;i<name3.length;i++) {
			
			System.out.println("Print chacters : "+name3[i]);
		}
		
		

	}

}