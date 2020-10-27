package com.daw.eva.exslist;

import java.util.Calendar;
import java.util.Collections;

public class Person implements Comparable<Person>{
	private Calendar birthdate;
	private String name;

	
	public Person(Calendar birthdate, String name) {
		super();
		this.birthdate = birthdate;
		this.name = name;
	}

	public Calendar getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Calendar birthdate) {
		this.birthdate = birthdate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		Calendar today = Calendar.getInstance();
		int age = today.get(Calendar.YEAR) - getBirthdate().get(Calendar.YEAR);
	
          
		if (getBirthdate().get(Calendar.MONTH) > today.get(Calendar.MONTH))
			age--;

		else if (getBirthdate().get(Calendar.MONTH) == today
				.get(Calendar.MONTH)
				&& getBirthdate().get(Calendar.DAY_OF_MONTH) > today
						.get(Calendar.DAY_OF_MONTH))
			age--;
		return age;
	}

	/**
	 * Exercici 5
	 */
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		int result = this.getAge() - o.getAge();
		if (result == 0){
			result = this.getName().compareTo(o.getName());
		}
		return result;
	}
}
