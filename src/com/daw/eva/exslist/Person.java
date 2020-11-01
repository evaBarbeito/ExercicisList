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
	//	System.out.println( today.get(Calendar.MONTH) + ", " +  today.get(Calendar.DAY_OF_MONTH) + ", " + today.get(Calendar.YEAR));
		
		int age = today.get(Calendar.YEAR) - getBirthdate().get(Calendar.YEAR);
	
          
		if (getBirthdate().get(Calendar.MONTH) > today.get(Calendar.MONTH))
			{age--;}// System.out.println("bap:" + age);}
		
		

		else if (getBirthdate().get(Calendar.MONTH) == today.get(Calendar.MONTH)
				&& getBirthdate().get(Calendar.DAY_OF_MONTH) > today.get(Calendar.DAY_OF_MONTH))
			{age--;}
			//System.out.println("bup!"+ age);}
		return age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((birthdate == null) ? 0 : birthdate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (birthdate == null) {
			if (other.birthdate != null)
				return false;
		} else if (!birthdate.equals(other.birthdate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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
