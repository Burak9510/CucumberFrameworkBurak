package com.neotech.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMaps {

	public static void main(String[] args) {
		
	
		List<Map<String, String>> listOfMaps = new ArrayList<>();
		
		Map<String, String> naim = new HashMap<>();
		
		naim.put("firstname", "Naim");
		naim.put("lastname", "Muti");
		
		listOfMaps.add(naim);
		
		System.out.println(listOfMaps);
        System.out.println(naim);
        
        Map<String, String> enes = new HashMap<>();
        
        enes.put("firstname", "Enes");
        enes.put("lastname", "Ugur");
        
        listOfMaps.add(enes);
        System.out.println(listOfMaps);
	
	
	    // how do I access the value: Naim
	
         System.out.println(listOfMaps.get(0).get("firstname"));       
	
         
         
	
	
	
	}

}
