package Data;

public class numrev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=12121;
		String rev="";
		String s=Integer.toString(n);
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			
		}System.out.println(rev);
		
		}

}
