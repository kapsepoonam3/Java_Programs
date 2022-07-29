package Data;

public class mm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		display1();
		//class variable=new class();
		mm m1=new mm();
		m1.display2();
	}
public static void display1() {
		System.out.println("static method");
		//m1.display3();
	}
	public void display2() {
	display3();
		System.out.println("non-static method2");
	}
	public void display3() {
		System.out.println("non-static method3");
	}
}
