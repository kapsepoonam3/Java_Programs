package Data;

public class revname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="madam";
		char c[]=s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}System.out.println("");
		
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}System.out.println(rev);
		System.out.println("");
		if(s.equals(rev))
		{
			System.out.println("String is palindrom");
		}else {
			System.out.println("String is not a palindrom");
		}
	}

}
