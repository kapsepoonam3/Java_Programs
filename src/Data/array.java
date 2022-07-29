package Data;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,....,n-1; 5; 0,1,2,3,4
		//size fixed
		//similar data types
		//datatype var[]; datatype[] var;
		int a[]= {24,25,26,27,28,34,67};//24=0,25=1...
		//System.out.println(a[2]);
		int l=a.length;
		System.out.println("l="+l);
		System.out.println("");
		for(int i=0;i<l;i++) {
			System.out.println(a[i]);
		}
		System.out.println("");
		for(int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}	
		System.out.println("");
		//int a[]= {24,25,26,27,28,34,67};
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
			
	}

}
