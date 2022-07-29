package practice;

import java.util.Map;

import java.util.*;

public class occurance {

	public static void main(String args[]) {
		String s="poonam";
		LinkedHashMap<Character,Integer> m=new LinkedHashMap<Character,Integer>();
		char c[]=s.toCharArray();
		
		for(char i : c) {
			if(m.containsKey(i)) {
				m.put(i,m.get(i)+1);
			}
			else
				m.put(i,1);
		}
		
		for(Map.Entry h: m.entrySet()) {
			System.out.println(h.getKey()+"="+h.getValue());
		}
	}
}
