package org.collects;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapFunction {
	
	private void hashMapMethod() {

		HashMap<Integer, String> u = new HashMap<Integer, String>();
		u.put(101, "yuvraj");
		u.put(102, "vignesh");
		u.put(103, "vaishali");
		u.put(104, "sangeeth");
		u.put(102, "fayaz");
		u.put(106, "vignesh");
	
		System.out.println(u);
		
		System.out.println(u.get(108));
		
		Set<Entry<Integer, String>> entrySet = u.entrySet();
		
		for (Entry<Integer, String> eachvalue : entrySet) 
		{
			//System.out.println(eachvalue.getKey());
			if(eachvalue.getKey().equals(108))
			{
			System.out.println(eachvalue.getValue().toString());
			break;
			}
			else
			{
				System.out.println("108 not found as key");
			}
		}

		
	}
	
	public static void main(String[] args) {
		MapFunction k = new MapFunction();
		k.hashMapMethod();

		
		
	}

}
