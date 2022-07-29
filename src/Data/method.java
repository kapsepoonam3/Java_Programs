package Data;

public class method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method m1=new method();
		display1();
		//class variable=new class();
		m1.display2();
		}

	public static void display1() {
		System.out.println("static method");
		}
	public void display2() {
		display3();
		System.out.println("non-static method2");
	}
	public void display3() {
		System.out.println("non-static method3");
	}
	
}
