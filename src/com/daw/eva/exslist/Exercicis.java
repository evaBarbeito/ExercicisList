package com.daw.eva.exslist;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercicis {
	
	 
	public static void main(String[] args) {
		
		/**
		 * Creació de persones
		 */
		Calendar birthDate = Calendar.getInstance();
		birthDate.set(2014, 1, 2);
		Person person1 = new Person(birthDate, "Petit");

		Calendar birthDate2 = Calendar.getInstance();
		birthDate2.set(1982, 10, 1);   //year, month, date
		Person person2 = new Person(birthDate2, "xMama");
		
		Calendar birthDate3 = Calendar.getInstance();
		birthDate3.set(2002, 11, 1);
		Person person3 = new Person(birthDate3, "2ngrauMig");

		Calendar birthDate4 = Calendar.getInstance();
		birthDate4.set(1982, 1, 2);
		Person person4 = new Person(birthDate4, "Papa");
		
		/**
		 * Creació de la llista
		 */
		List<Person> persons = new ArrayList<Person>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);

		
		System.out.println("La llista per ordre d'execució: ");
		PersonList.printListPerson(persons);
		
		System.out.println("La llista conté a xMama?: " + persons.contains(person2));
		System.out.println("La llista conté a xMama?: " + persons.contains(new Person(birthDate2, "xMama")));
		System.out.println("La llista conté a Papa?: " + persons.contains(new Person(birthDate4, "Papa")));
		System.out.println("La llista conté a Papa?: " + persons.contains(person4));
		System.out.println("La llista conté a Papa?: " + persons.contains(new Person(birthDate4,"PapaJones")));
		
		/**
		 * Exercici 3
		 */
		System.out.println("3.La llista de menors: ");
		List<Person> menors = PersonList.menorsEdat(persons);
		PersonList.printListPerson(menors);
		
		/**
		 * Exercici 5
		 */
	//	Collections.sort(persons);
		Collections.sort(persons);
		System.out.println("5.La llista ordenada és: ");
		PersonList.printListPerson(persons);
		/**
		 * Exercici 4
		 */
		List<Person> menors2 = PersonList.menorsEdat2(persons);
		System.out.println("4.La llista de menors: ");
		PersonList.printListPerson(menors2);
		
	}

	
}
