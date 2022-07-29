package Ops;
//can not extend final class
public final class final1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//final variable, can not change value
		final int i=5,j=4;
		final1 a=new final1();
		a.add(i, j);
		
	}

	//can not override final method
	public final void add(int i,int j) {
		System.out.println(i+j);
	}
}
