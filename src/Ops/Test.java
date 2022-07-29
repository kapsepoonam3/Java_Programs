package Ops;

public class Test extends Teacher {
	//child extends parent
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//single,multilevel,multiple
				
		Test t=new Test();
		t.T1();
		t.subject();
		t.Timetable();
		Time();
		
		Teacher t1=new Teacher();
		t1.Timetable();
		
		Teacher t2=new Test();
		t2.subject();
		
	}
	
	public void T1() {
		System.out.println("T1");
	}

}
