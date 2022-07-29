package practice;

public class char1 {
	public static void main(String args[]) {
	      String s="Poonam";
	char c[]=s.toCharArray();
	int count=1;
	for(int i=0;i<c.length;i++)
	{
	for(int j=i+1;j<c.length;j++)
	{
		if(c[i]==c[j])
		{
		count++;
		c[j]=0;
		}
	}
	if(c[i]!=0){System.out.println(c[i]+"="+count);}
	}
	    }

}
