package Const;

public class Test1 extends parent{
Test1(){
	System.out.println("parent default");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p=new parent(10);
		//child object first call parent default const then call child default const
		//can not call parameterized const of parent using child object
		Test1 t=new Test1();
		//parent p1=new parent(10);
	}

}
