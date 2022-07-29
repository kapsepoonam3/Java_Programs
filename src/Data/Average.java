package Data;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float m=61,h=60,e=60,avg;
				avg=(m+h+e)/3;
		if(avg>0&&avg<=40)
		{
			System.out.println("student is pass with grade D");
		}else if(avg>40&&avg<=60) {
				System.out.println("student is pass with grade C");
		}else if(avg>60&&avg<=80) {
			System.out.println("student is pass with grade B");
		}else if(avg>80&&avg<=100) {
				System.out.println("student is pass with grade A");
		}
		
	}

}
