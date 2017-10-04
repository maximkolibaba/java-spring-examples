package com.company.factorymethoddemo;

import com.company.common.Person;

public class StaticMethodFactory {
	public static Person getPerson() {
		Person person = new Person("Ivan","Ivanov", 35);
		return person;
	}
}
