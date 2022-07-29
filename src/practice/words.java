package practice;

public class words
{
public static void main(String args[])
{
String s="I am poonam with two kids, ok";
int count=0;
if(s.charAt(0)!=' ' )
{
count++;
}
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)==' ' && s.charAt(i+1)!=' ')
count++;
}System.out.println(count);
}
}