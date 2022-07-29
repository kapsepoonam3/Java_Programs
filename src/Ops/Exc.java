package Ops;

public class Exc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//try,catch,finally
		try {
		int a[]=new int[5];
		a[4]=10;
		int i=100;
		System.out.println(i);
		
		int j=i/0;
		//int j=99;
		System.out.println(j);
		
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception is catched "+e);
			
		}catch(Exception e) {
			System.out.println("Exception1 is catched "+e);
			System.exit(0);

		}
		finally {
			System.out.println("finally block");
		}
		System.out.println("After TCF(TF,TC) block");
		
		
	}
	//System.exit(0);finally block will not execute,we can write in try or catch block,
	//If 0 is not given,exits abnormally at the backend.

}
