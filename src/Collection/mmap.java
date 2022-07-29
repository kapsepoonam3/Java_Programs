package Collection;

import java.util.*;

public class mmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//list,queue,set-store values
		//map-key(unique) ,value(can duplicate) pair,entrySet
		//class<key, value> var=new class <key,value>();
		//HashMap(random,key value can be null),LinkedHashMap(insertion,null),TreeMap(ascending,not null)
		//HashMap<Integer,String> h=new HashMap<Integer,String>();
		//LinkedHashMap<Integer,String> h=new LinkedHashMap<Integer,String>();h.put(10,"St");
		//key is generally Integer or String
		TreeMap<Integer,String> h=new TreeMap<Integer,String>();
		h.put(10,"rt");
		h.put(30,"rt");
		h.put(10,"sd");
		h.put(50,null);
		//h.put(null,"as");
		//h.put(null, null);
		h.put(5,"hj");
		h.put(12,"gh");
		h.remove(10,"rt");
		
		for(Map.Entry i:h.entrySet()) {
			System.out.println(i.getKey()+" "+i.getValue());
		}
	}

}
