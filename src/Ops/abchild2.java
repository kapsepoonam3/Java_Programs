package Ops;

public class abchild2 extends abchild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		abchild2 a2=new abchild2();
		a2.ab1();
		a2.ab2();
		a2.ab3();
		a2.ab4();
		
		abchild a1=new abchild2();
		a1.ab1();
		a1.ab2();
		a1.ab3();
		a1.ab4();
		
		abstr a=new abchild2();
		a.ab1();
		a.ab2();
		a.ab3();
		a.ab4();
	}
	
	public void ab3() {
		System.out.println("ab3");
	}
	
	public void ab4() {
		System.out.println("ab4");
	}
	
}
