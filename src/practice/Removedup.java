package practice;

public class Removedup
{
public static void main(String args[])
{
String s="go to gym";
char c[]=s.toCharArray();

for(int i=0;i<c.length;i++)
{
int count=1;
	for(int j=i+1;j<c.length;j++)
	{
		if(c[i]==c[j]&&c[i]!=' ')
		{
		count++;
		c[j]=0;
		}
	}
	if(c[i]!=' '&&count==1)
	{
	System.out.print(c[i]);
	}
	}
}
}