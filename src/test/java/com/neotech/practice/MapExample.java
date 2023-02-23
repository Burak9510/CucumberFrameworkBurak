package com.neotech.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		//K,V - key and value
		Map<String, String> map = new LinkedHashMap<>();
		
		map.put("firstname", "Hakan");
		map.put("lastname", "Uysal");
		map.put("age", "27");
		
		System.out.println(map);
		
		
		String firstname = map.get("firstname");
		System.out.println(firstname);
		String lastname = map.get("lastname");
		System.out.println(lastname);
		

		
		
	}

}
