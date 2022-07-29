package Collection;

import java.util.*;
//import java.util.*;

public class Arrlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//List -Arraylist,Linkedlist,Vector,Stack
		//iterator
		//Insertion order preserve
		//datatype is used as wrapper class(datatype conversion into object)
		//class <datatype> var=new class<datatype>();
		ArrayList <String> a=new ArrayList<String>();
		//List <String> a=new ArrayList<String>();
		a.add("AD");
		a.add("AG");
		a.add("AH");
		a.add("AJ");
		a.add(null);
		a.add("AJ");
		a.remove(4);
		/*Iterator i=a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}*/
		//enhance for loop
		for(String p:a) {
			System.out.println(p);
		}
		
	}

}
