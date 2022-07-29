package practice;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,67,45,34,98,45};
		int min=a[0],max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min) 
			{
				min=a[i];
			}
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Smallest num="+min);
		System.out.println("Largest num="+max);
	}

}
