package Collection;

import java.util.*;

public class Pqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Queue-Priority Queue,ArrayDq
		//FIFO
		//Don't preserve Insertion order,null values not allowed
		PriorityQueue <String> p=new PriorityQueue <String>();
		//ArrayDeque preserve Insertion Order
	  //ArrayDeque <String> p=new ArrayDeque <String>();
		p.add("DF");
		p.add("TY");
		p.add("TY");
		p.add("DG");
		p.add("ER");
		p.remove("TY");
	//	p.remove();
	//	p.remove();
		
		for(String s:p) {
			System.out.println(s);
		}
	}

}
