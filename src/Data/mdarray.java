package Data;

public class mdarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{2,3},{4,5}};//2=00,3=01,4=10,5=11
		int b[][]=new int[3][3];
		b[0][0]=10;
		b[0][1]=11;
		b[0][2]=12;
		b[1][0]=13;
		b[1][1]=14;
		b[1][2]=15;
		b[2][0]=16;
		b[2][1]=17;
		b[2][2]=18;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
				}
			System.out.println("");
		}
		
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b.length;j++) {
				System.out.print(b[i][j]+" ");
			}System.out.println("");
		}
	}

}
