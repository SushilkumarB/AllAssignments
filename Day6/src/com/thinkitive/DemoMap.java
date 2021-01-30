package com.thinkitive;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoMap {
	public static void main(String[] args) {
		
		Map<Integer,String> map  = new HashMap<Integer, String>();
		
		
		map.put(56,"abc");
		map.put(57,"bcd");
		map.put(58,"cde");
		map.put(2,"abc");
		map.put(1,"abc");
		
		System.out.println(map);
		
		
	}

}
