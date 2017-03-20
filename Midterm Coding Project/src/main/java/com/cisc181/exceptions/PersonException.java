package com.cisc181.exceptions;

import com.cisc181.core.Person;

public class PersonException extends Exception {
	private Person BadPerson;
	
	public PersonException(Person BadPerson){
		this.setBadPerson(BadPerson);
	}

	public Person getBadPerson() {
		return BadPerson;
	}

	public void setBadPerson(Person badPerson) {
		BadPerson = badPerson;
	}
	
}
