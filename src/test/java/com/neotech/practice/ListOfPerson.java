package com.neotech.practice;

import java.util.ArrayList;
import java.util.List;

public class ListOfPerson {

	public static void main(String[] args) {

		List<Person> listOfPeople = new ArrayList<>();
		
		//what if I already have a Person
		Person Serkan = new Person("Serkan", 26, "Miami", 180000);
		
		listOfPeople.add(new Person("Harun", 25, "NYC", 200000));
		listOfPeople.add(Serkan);
		listOfPeople.add(new Person("Baris", 30, "Montreal", 150000));
		
		System.out.println(listOfPeople);
		
		for (Person person : listOfPeople)
		{
			System.out.println(person);
		}
	
	}

}



class Person
{
	String name; 
	int age;
	String location;
	double salary;
	
	public Person(String name, int age, String location, double salary)
	{
		this.name = name; 
		this.age = age;
		this.location = location;
		this.salary = salary;
	}
	
	
	public String toString()
	{
		return name + " : " + age + " : " + location + " : " + salary;
	}
}
