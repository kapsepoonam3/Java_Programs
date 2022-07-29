package practice;

public class duplicate
{
public static void main(String args[])
{
String s="go to gym";
char c[]=s.toCharArray();
int count=1;
for(int i=0;i<c.length;i++)
{
	for(int j=i+1;j<c.length;j++)
	{
		if(c[i]==c[j]&&c[i]!=' ')
		{
		count++;
		c[j]=0;
		}
	}
	if(c[i]!=0&&count>1)
	{
	System.out.print(c[i]);
	}
}
}
}
