package com.company.staticmethodinitializationdemo;

import com.company.common.Person;

public class MethodFactory {
	public Person getPerson() {
		Person person = new Person("Petr","Petrov", 25);
		return person;
	}
}
