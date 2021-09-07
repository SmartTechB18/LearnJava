package com.more_Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsInJava {

	public static void main(String[] args) {

	//	a[0] =10;   syso(a[i]);
		List<String> array = new Stack<String>();
		array.add("Milk");
		array.add("Egg");
		array.add(null);
		array.add("Banana");
		array.add("Milk");
		array.add("Apple");
		array.add("Orange");
		array.add(null);	
		System.out.println(array.toString());
		
		System.out.println(array.get(3));
		
		LinkedList<String> array2 = new LinkedList<String>();
		array2.add("Milk");
		array2.add("Egg");	
		array2.add(null);
		array2.add("Banana");
		array2.add("Milk");
		array2.add("Apple");
		array2.add("Orange");
		array2.add(null);
		
		System.out.println(array2.toString());
		
		HashSet<String> x = new HashSet<String>();
		x.add("Milk");
		x.add("Egg");
		x.add("Banana");
		x.add(null);
		x.add("Milk");
		x.add("Apple");
		x.add("Orange");
		x.add(null);
		System.out.println(x.toString());

		LinkedHashSet<String> y = new LinkedHashSet<String>();
		y.add("Milk");
		y.add("Egg");
		y.add("Banana");
		y.add(null);
		y.add("Milk");
		y.add("Apple");
		y.add("Orange");
		y.add(null);
		System.out.println(y.toString());
		
		TreeSet<String> z =new TreeSet<String>();
		z.add("Milk");
		z.add("Egg");
		z.add("Banana");
		z.add("Milk");
		z.add("Apple");
		z.add("Orange");		
		System.out.println(z.toString());
		System.out.println(z.contains("Apple"));
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Milk", 9);
		map.put("Egg", 2);
		map.put(null, 0);
		map.put("Banana", 2);
		map.put("Milk", 2);
		map.put("Apple", 3);
		map.put("Orange", 4);
		map.put(null, 5);
		System.out.println(map.toString());
		System.out.println(map.get("Apple"));
		
		Map<String, Integer> map2 = new Hashtable<String, Integer>();
		map2.put("Milk", 9);
		map2.put("Egg", 2);
		
		map2.put("Banana", 2);
		map2.put("Milk", 2);
		map2.put("Apple", 3);
		map2.put("Orange", 4);
		
		System.out.println(map2.toString());
		System.out.println(map2.get("Apple"));
		
		Map<String, Integer> map1 = new TreeMap<String, Integer>();
		map1.put("Milk", 9);
		map1.put("Egg", 2);
		
		map1.put("Banana", 2);
		map1.put("Milk", 2);
		map1.put("Apple", 3);
		map1.put("Orange", 4);
		
		System.out.println(map1.toString());
	}

}
