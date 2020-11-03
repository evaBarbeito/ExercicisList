package com.daw.eva.exslist;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Collections;

public class Person implements Comparable<Person>{
	private Calendar birthdate;
	private String name;
	public LocalDateTime birthDate2;

	
	public Person(Calendar birthdate, String name, LocalDateTime birthdate2) {
		super();
		this.birthdate = birthdate;
		this.name = name;
		this.birthDate2=birthdate2;
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
		//System.out.println( today.get(Calendar.MONTH) + ", " +  today.get(Calendar.DAY_OF_MONTH) + ", " + today.get(Calendar.YEAR));
		
		int age = today.get(Calendar.YEAR) - getBirthdate().get(Calendar.YEAR);
	
          
		if (getBirthdate().get(Calendar.MONTH) > today.get(Calendar.MONTH)+1)
			{age--;}
		
		

		else if (getBirthdate().get(Calendar.MONTH) == today.get(Calendar.MONTH)+1
				&& getBirthdate().get(Calendar.DAY_OF_MONTH) > today.get(Calendar.DAY_OF_MONTH))
			{age--;}
		
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
//		int result = this.getAge() - o.getAge();
//		if (result == 0){
//			result = this.getName().compareTo(o.getName());
//		}
//		return result;
		
		//isAfter, ordenada per data de naixement
		//isBefore, decreixent 
		if (this.birthDate2.isAfter(o.birthDate2)) return -1;
        else if (this.birthDate2.equals(o.birthDate2)) {
        	return this.getName().compareTo(o.getName());
        }
        else return 1;

	}
}
