package Data;

public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hello("Java",10);
		input m1=new input();
		m1.hello1("testing",10.5f);
		//int z=add(5,7);
		System.out.println("Addition= "+add(10,20));
		int m=m1.add1(15,67);
		System.out.println("Addition= "+m);
	}
	public static void hello(String s,int i) {
		System.out.println("Hi "+s +i);
	}
	public void hello1(String s,float f) {
		System.out.println("Non static "+s+" "+f);
	}
	
	public static int add(int x,int y) {
		int k=x+y;
		return k;
	}
	
	public int add1(int i,int j) {
		int k=i+j;
		return k;
	}
}
