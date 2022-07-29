package practice;

public class recursion
{
public static void main(String args[])
{
int fact=rec(5);
System.out.println(fact);
}
public static int rec(int num)
{
if(num==0||num==1)
{
return 1;
}
else
{
return num*rec(num-1);
}

}
}