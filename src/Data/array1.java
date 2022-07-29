package Data;

public class array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//datatype var[]=new datatype[size];
		int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}

}
