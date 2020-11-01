package com.daw.eva.exslist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonList {

	 public static final int MAJOR_EDAT=18;
	 
	public static void printListPerson(List<Person> persons){
		for (Person person : persons){
			System.out.println(person.getName() + ", " + person.getAge());
		}
	}
	
	public static List<Person> menorsEdat(List<Person> persons) {

		List<Person> menors = new ArrayList<>();
		for (Person person : persons) {
			if (person.getAge() < MAJOR_EDAT) {
				menors.add(person);
			}
		}
		return menors;
	}
	
	public static List<Person> menorsEdat2(List<Person> persons) {
		boolean esMenor = true;
		List<Person> menors = new ArrayList<>();
		Iterator<Person> it = persons.iterator();
		int i=0;
		while (it.hasNext() && esMenor){
			if (it.next().getAge()>=MAJOR_EDAT) esMenor = false;
			i++;
		}
		menors = persons.subList(0, i-1);
		return menors;
	}
}
