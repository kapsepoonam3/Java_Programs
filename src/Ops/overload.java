package Ops;

public class overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overload o=new overload();
		o.sub(10.4f,6.8f);
		sub(56,45);
		
	}

	public static void sub(int i,int j)
	{
	System.out.println(i-j);
	}
	
	public void sub(float i,float j)
	{
	System.out.println(i-j);
	}
}