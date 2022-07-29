package Data;

public class smethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s=add(10);
		System.out.println("Sum= "+s);
		System.out.println("Sum= "+add(10));
	}
	
	public static int add(int i) {
		int j,s=0;
		for(j=1;j<=i;j++) {
			s=s+j;
			//System.out.println("Sum= "+sum);
		}
		return s;
	}
}
