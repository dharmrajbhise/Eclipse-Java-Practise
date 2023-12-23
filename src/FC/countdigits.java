package FC;

public class countdigits {

	public static void main(String[] args) {
		int no = 153,temp,ans=0,rem;
		temp=no;
		
		while(temp>0) {
			
			rem=temp%10;
			
			ans= ans+rem*rem*rem;
			temp = temp/10;
		}
		System.out.println(ans);

	}

}
