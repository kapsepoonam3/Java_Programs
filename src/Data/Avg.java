package Data;

public class Avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Avg m1=new Avg();
		int m =avg(50,60,70);
		System.out.println("Average is "+m);
		System.out.println("Average is "+avg(50,60,70));
		System.out.println("Average1 is "+m1.avg1(90,80,70));
	}

	public static int avg(int hin,int math,int eng) {
		return (hin+math+eng)/3;
	}
	
	public int avg1(int hin,int math,int eng) {
		return (hin+math+eng)/3;
	}
}
