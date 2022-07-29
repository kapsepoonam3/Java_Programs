package practice;

public class lines
{
public static void main(String args[])
{
int count=0;
String s="I am poonam. I love pizza. How are u??";
for(int i=0;i<s.length();i++)
{
if(s.charAt(i)=='.'||s.charAt(i)=='?')
count++;
}System.out.println(count);
}
}