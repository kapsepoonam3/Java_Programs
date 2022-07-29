package Collection;

import java.util.Stack;

public class ss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack <String> s=new Stack <String>();
		//LIFO, FILO
		s.push("DF");
		s.push("TY");
		s.push("DG");
		s.push("ER");
		s.pop();
		System.out.println(s.peek());
		/*for(String ss:s) {
			System.out.println(ss);
	}*/
	}
}
