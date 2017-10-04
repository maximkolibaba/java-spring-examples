package com.company.annotationdemo.common;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.company.common.Person;

public class Child {
	private String firstName;
	private String lastName;
	private int age;

	@Autowired
	@Qualifier("mariaIvanova")
	private Person mother;
	
	@Resource(name="ivanIvanov")
	private Person father;
	
	public Child() {}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAge() {
		return age;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Person getMother() {
		return mother;
	}

	public Person getFather() {
		return father;
	}

	public void setMother(Person mother) {
		this.mother = mother;
	}

	public void setFather(Person father) {
		this.father = father;
	}
	
	public String toString() {
		return firstName + " " + lastName + ", " + age + ".";
	}
}
