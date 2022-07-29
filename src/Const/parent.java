package Const;

public class parent extends Gp {
//same as class name,object,no return type
	//default,parameterized
	parent() {
		//can call both static and non static methods from const
		//no need to create object for non static method
		parent();
		GP1();//method
	System.out.println("Default constructor");
	}
	
	parent(int i) {
		System.out.println("parameterized constructor");
		}
	
	public void parent() {
		System.out.println("static method");
	}
}
