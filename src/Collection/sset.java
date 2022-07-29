package Collection;

import java.util.*;

public class sset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set-HashSet,LinkedHashSet,TreeSet
		//dont allow duplicate values
		//in HashSet data set in random order, it will not show any error for duplicate values
		//LinkedHashSet preserve insertion order
		
		LinkedHashSet <Integer> h=new LinkedHashSet <Integer>();
		//HashSet <String> h=new HashSet <String>();
		//TreeSet- Data in ascending order
		//TreeSet <Integer> h=new TreeSet <Integer>();
		
		h.add(12);
		h.add(null);//-not allowed
		h.add(78);
		h.add(34);
		h.add(55);
		h.add(55);
	
		h.remove(12);
		for(Integer s:h) {
			System.out.println(s);
		}

	}

}
