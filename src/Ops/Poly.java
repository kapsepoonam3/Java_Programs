package Ops;

public class Poly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//method overloading,method overriding
		//method overloading (single class),static,non static,compile time
		//method overriding (parent child),non static-static,private,main,final- not allowed,run time
		Poly p=new Poly();
		
		main("Java");
		main(11);
		p.add();
		p.add(10,20,30);
		p.add(10,20);
		p.add(10.9f,20.8f);
	}
	
	public static void main(String s) {
		System.out.println(s);
	}
	
	public static void main(int i) {
		System.out.println(i);
	}
	
	private void add() {
		System.out.println("Add");
	}
	
	private void add(int i,int j) {
		System.out.println(i+j);
	}
	
	private void add(int i,int j,int k) {
		System.out.println(i+j+k);
	}
	
	private void add(float i,float j) {
		System.out.println(i+j);
	}

}
