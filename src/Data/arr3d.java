package Data;

public class arr3d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{6,7,8},{1,2,3,4}};//i=3,a[0]=3,a[1]=3,a[2]=4
		System.out.println(a[2].length);
		for(int i=0;i<a.length;i++) 
		{
			
			for(int j=0;j<a[i].length;j++) 
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
			
	}

}
//int numberOfRows = arr.length;
//int numberOfColumnsin EachRow = arr[0].length;