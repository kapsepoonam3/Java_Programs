package Ops;

public class Test3 extends Test2 implements Intr1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test3 t=new Test3();
		t.display();
		t.st();
		//Interface referring to child class
		Intr i=new Test3();
		i.display();
		
		Intr1 r=new Test3();
		r.st();
		r.display();
	}

	public void display() {
		System.out.println("D1");
	}
	
	public void st() {
		System.out.println("st");
	}
}
