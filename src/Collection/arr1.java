package Collection;

import java.util.*;

public class arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LinkedList <Object> a=new LinkedList<Object>();
		Vector <Integer> v=new Vector <Integer>();
		
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		Iterator i=v.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
