package Ops;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String constant pool(ref)
		//different content,reference also different
		String s="Test1";
		String s3="Test";
		
//Heap(ref), String constant pool
		String s1=new String("Test1");
		String s2=new String("Test1");
		
	//==(ref),equals(content)
		System.out.println(s==s1);
		System.out.println(s3==s);
		System.out.println(s.equals(s1));
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s7="Test--";
		s7.concat("Manual");
		String s8=s7.concat("Manual");
		System.out.println(s8);
		//String is immutable
	
		//StringBuffer, StringBuilder(classes can make String mutable)
		//Threadsafe
		StringBuffer sb=new StringBuffer("Java");
		System.out.println(sb);
		sb.append(" Home");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.replace(0, 3, "lt");
		System.out.println(sb);
		sb.insert(2, "po");
		System.out.println(sb);
		
		//Multithreading
		StringBuilder sb1=new StringBuilder("WE");
		sb1.append(" are");
		System.out.println(sb1);
	}

}
