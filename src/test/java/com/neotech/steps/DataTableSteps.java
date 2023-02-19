package com.neotech.steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableSteps {

	@When("I login to the HRMS")
	public void i_login_to_the_hrms() {
	    System.out.println("Login");
	}
	@When("I want to add Employees")
	public void i_want_to_add_employees(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   
		//List of Maps 
		
//		Map<String, String> map1 = new HashMap<>();
//		map1.put("FN", "Dardan");
//		map1.put("MD", null);
//		map1.put("LN", "Meshi");
//		
//		
//		Map<String, String > map2 = new HashMap<>();
//		map2.put("FN", "Emine");
//		map2.put("MD", "Bahar");
//		map2.put("LN", "Karakaya");
//		
//		Map<String, String> map3 = new HashMap<>();
//		map3.put("FN", "Hakan");
//		map3.put("MD", "Can");
//		map3.put("LN", "Uysal");
//	    
//		List<Map<String, String>> lm = new ArrayList<>();
//		lm.add(map1);
//		lm.add(map2);
//		lm.add(map3);
//		
		
		List<Map<String, String>> listOfMaps =  dataTable.asMaps();
		
		for(Map<String, String> map : listOfMaps)
		{
			System.out.println(map);
			
			System.out.println("FistName: " + map.get("FirstName"));
            System.out.println("MiddleName: " + map.get("MiddleName"));
            System.out.println("LastName: " + map.get("LastName"));
		}
		
		
	}
	@Then("I validate employee is added")
	public void i_validate_employee_is_added() {
	   System.out.println("Validate Employees Added");
	}

}
