package practice;

public class factorial
{
public static void main(String args[])
{
int num=5,fact=1;
if(num==0 || num==1)
{
System.out.println(1);
}
for (int i=num;i>=1;i--)
{
fact=fact*i;
}System.out.println(fact);
}
}