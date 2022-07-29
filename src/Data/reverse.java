package Data;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I am going to school.";
		char c[]=s.toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]);
		}
	}

}
