package com.neotech.practice;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {


		List<String> list = new ArrayList<>(); 

		list.add("Hakan");
		list.add("Mehmet");
		list.add("Syed");
		list.add("Jeremy");
		
		System.out.println(list);
		
		for (String str : list)
		{
			System.out.print(str + " - ");
		}
		
		//	0			   1
		//[ "Hakan" ,   "Mehmet"]
		
	}

}
