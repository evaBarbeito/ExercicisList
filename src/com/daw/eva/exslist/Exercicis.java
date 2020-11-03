package com.daw.eva.exslist;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
	
		
		Calendar birthDate = Calendar.getInstance();
		birthDate.set(2014, 1, 2);
		Person person1 = new Person(birthDate, "Petit",LocalDateTime.parse("02-01-2014 00:01", formatter));

		Calendar birthDate2 = Calendar.getInstance();
		birthDate2.set(1982, 10, 1);   //year, month, date
		Person person2 = new Person(birthDate2, "xMama",LocalDateTime.parse("01-01-1982 00:01", formatter)); //canviar mes de naixement de mama a octubre, 10
		
		Calendar birthDate3 = Calendar.getInstance();
		birthDate3.set(2002, 11, 4);
		Person person3 = new Person(birthDate3, "2ngrauMig",LocalDateTime.parse("04-11-2002 00:01", formatter));

		Calendar birthDate4 = Calendar.getInstance();
		birthDate4.set(1982, 1, 2);
		Person person4 = new Person(birthDate4, "Papa",LocalDateTime.parse("01-01-1982 00:01", formatter));
		
		/**
		 * Creació de la llista
		 */
		List<Person> persons = new ArrayList<Person>();
		persons.add(person1);
		persons.add(person2);
		persons.add(person3);
		persons.add(person4);

		
//		System.out.println("La llista per ordre d'execució: ");
//		PersonList.printListPerson(persons);
//		//ha de tenir sobreescrit mètode equals a Person, per poder donar true a .contains(new Person....
//		System.out.println("La llista conté a xMama?: " + persons.contains(person2));
//		System.out.println("La llista conté a xMama?: " + persons.contains(new Person(birthDate2, "xMama")));
//		System.out.println("La llista conté a Papa?: " + persons.contains(new Person(birthDate4, "Papa")));
//		System.out.println("La llista conté a Papa?: " + persons.contains(person4));
//		System.out.println("La llista conté a Papa?: " + persons.contains(new Person(birthDate4,"PapaJones")));
//		
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
